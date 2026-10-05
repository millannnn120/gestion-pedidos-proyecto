# Contributing

Thanks for helping with this project! Please follow these simple rules.

## Branching strategy

- `main` is the stable branch. **Nobody pushes directly to `main`**.
- Create a new branch from `main` for every change, using these prefixes:

| Prefix | Use | Example |
|--------|-----|---------|
| `feature/` | New functionality or documentation | `feature/code-documentation` |
| `fix/` | Bug fixes | `fix/readme-improvements` |
| `docs/` | Only documentation changes | `docs/update-setup-steps` |

- Use lowercase and hyphens, and keep the name short and clear.

```bash
git checkout main
git pull
git checkout -b feature/my-new-feature
```

## Commit conventions

We use the [Conventional Commits](https://www.conventionalcommits.org/) style:

```
<type>: <short description>
```

Allowed types: `feat`, `fix`, `docs`, `test`, `refactor`, `chore`.

Rules:

- Write the description in English, in the imperative ("add", not "added").
- Maximum 72 characters in the first line, and no full stop at the end.
- One commit = one logical change.

Examples:

```
feat: add discount to physical products
fix: correct VAT calculation in ProductoDigital
docs: add setup instructions to README
```

## Pull request guidelines

1. Make sure the project compiles and the tests pass (`mvn test`).
2. Push your branch and open a Pull Request targeting `main`.
3. Use a clear title and explain **what** you changed and **why**.
4. Keep the PR small and focused on one topic.
5. At least one person (not the author, or a self-review in individual projects)
   must review and approve the PR before merging.
6. If the reviewer asks for changes, add new commits to the same branch.
7. If a PR is rejected, the reviewer must write a comment explaining the reason.

## Code style

- Every class, method, parameter and return value must have Javadoc.
- Use 4 spaces for indentation and `CamelCase` for classes.
- Add or update unit tests when you change the logic.
