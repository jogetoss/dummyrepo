# dummyrepo

A minimal Joget plugin used to practice GitHub workflows, branch protection, and security settings.

## What It Does

**Dummy Tool** is a simple Process Tool plugin. When it run in a process, it logs a configurable message and returns it.

## Build

```bash
mvn clean package
```

Output JAR: `target/dummyrepo-1.0-SNAPSHOT.jar`

Upload via **Settings → Manage Plugins** in Joget.

> Requires `wflow-core` in your local Maven setup (same as other Joget plugins in this workspace).

## Project layout

```
src/main/java/org/joget/dummyrepo/
  Activator.java      # OSGi bundle activator
  DummyTool.java      # Process Tool plugin
src/main/resources/
  messages/           # i18n labels
  properties/         # Plugin property UI (JSON)
```

## GitHub practice workflow

Suggested setup for learning branch rules and security:

1. Push this repo to GitHub (`main` as default branch).
2. **Settings → Branches → Add branch protection rule** for `main`:
   - Require a pull request before merging
   - Require status checks (e.g. **Build** workflow)
   - Do not allow bypassing
3. **Settings → General → Pull Requests**: enable squash merge if you prefer.
4. Work on feature branches, e.g. `feature/add-logging`, open PRs into `main`.
5. Optional: **Settings → Code security** — enable Dependabot alerts and secret scanning.

## Contributing

See [CONTRIBUTING.md](CONTRIBUTING.md).

## License

Apache License 2.0 — see [LICENSE](LICENSE).
