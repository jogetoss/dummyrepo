# Contributing to dummyrepo

This is a practice repository for GitHub collaboration workflows.

## Branching

- `main` — protected; merge only via pull request
- `feature/*` — new work (e.g. `feature/improve-dummy-tool`)
- `fix/*` — bug fixes

## Pull request process

1. Create a branch from `main`.
2. Make your changes and run `mvn test` locally.
3. Push the branch and open a PR into `main`.
4. Wait for CI (Build workflow) to pass.
5. Get review / approval if branch rules require it.
6. Squash merge when ready.

## Commit messages

Use clear, short messages:

- `Add default message property`
- `Fix Activator service registration`
