package org.joget.dummyrepo;

import java.util.Map;
import org.joget.apps.app.service.AppPluginUtil;
import org.joget.apps.app.service.AppUtil;
import org.joget.commons.util.LogUtil;
import org.joget.plugin.base.DefaultApplicationPlugin;

public class DummyTool extends DefaultApplicationPlugin {

    public static final String MESSAGE_PATH = "messages/DummyTool";

    @Override
    public String getName() {
        return getMessage("dummy.name");
    }

    @Override
    public String getVersion() {
        return getMessage("dummy.version");
    }

    @Override
    public String getDescription() {
        return getMessage("dummy.desc");
    }

    @Override
    public String getLabel() {
        return getMessage("dummy.label");
    }

    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public String getPropertyOptions() {
        return AppUtil.readPluginResource(getClass().getName(), "/properties/DummyTool.json", null, true, MESSAGE_PATH);
    }

    @Override
    public Object execute(Map properties) {
        String message = getPropertyString("message");
        if (message == null || message.trim().isEmpty()) {
            message = getMessage("dummy.defaultMessage");
        }
        LogUtil.info(getClass().getName(), message);
        return message;
    }

    protected String getMessage(String key) {
        return AppPluginUtil.getMessage(key, getClass().getName(), MESSAGE_PATH);
    }
}
