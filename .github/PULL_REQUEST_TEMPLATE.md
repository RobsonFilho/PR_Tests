## Changelog:
- Describe your change here.



### Attention
Before open an PR, please, read our [guidelines](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines) below.

Additionally, feel free to reach out to us in the  #storage-and-databases-abstractions Slack channel.

---
## [No breaking changes](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#No-breaking-changes)
Any functions that are not marked as private might be used by other projects, even in internal namespaces.

To avoid breaking, consider adding a new version of the component, a new function or an extra arity, keeping the previous behavior intact. Then deprecate old component/function, add vis/info's to track usages and only remove it on the next breaking change PR.

If you do a breaking change, potentially hundreds of services will have to accommodate your changes to be able to use the latest version.


But, if you have a good reason, that justifies the disruption, prepend [BREAKING] to your PR title so people will review it more carefully. Do the same on CHANGELOG.md explaining the migration path. Depending on the complexity, you should personally coach each squad to migrate their services.


***note:*** Bumping versions of other common libraries is not a breaking change. Just add a notice on CHANGELOG.md.

If you haven't, watch Rich Hickey's [talk on Spec'ulation](https://www.youtube.com/watch?v=oyLBGkS5ICk)



---

## [Avoid changing dependencies](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#Avoid-changing-dependencies)
Adding dependencies can significantly grow the size and complexity of projects.

When a new dependency is needed, we recommend reviewing suitable alternatives that might already be in the classpath and requiring it explicitly.

It's also important to be careful when removing dependencies, as other projects might rely on them transitively.

---

## [Dependencies used in the project must be explicitly required](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#Dependencies-used-in-the-project-must-be-explicitly-required)
When relying on a transitive dependency we are subject to other projects management of dependencies, which might lead to breaking changes when that dependency is updated or removed upstream.

---

## [Be mindful of the blast radius](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#Be-mindful-of-the-blast-radius)
Common libraries are used by hundreds, sometimes thousands of projects across the company. They directly impact business-critical processes and customer experience.

---

## [Consider other solutions](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#Consider-other-solutions)
The vast majority of problems have different ways of solving them.

Before submitting a Pull Request to a common library, make sure other solutions have been considered and document those in the PR.

---

## [Test changes](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#Test-changes)
All Pull Requests must have evidence of testing in at least one service.

When working on a change, create a beta version and deploy it to a service owned and operated by your team.

Document the time of deployment and, when possible, attach related metrics.

---

## [Have a problem statement](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#Have-a-problem-statement])
Changes to common libraries should always solve a current and understood problem. This helps ensure the change is applicable to more than one team and that it's possible to prove the effectiveness of the change.

---

## [Changes should be useful to more than one team](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines#Changes-should-be-useful-to-more-than-one-team)
If a change only applies to a very limited domain, it's likely it could be solved in another location such as in a service or a smaller library. This helps tremendously in the maintainability of common libraries.

---

#### Hey !
***If you've made it this far, I hope you've read all our  [guidelines](https://nubank.atlassian.net/wiki/spaces/SDAPF/pages/263932675104/Guidelines) :)
We are running a canary test to see how many engineers read our guidelines until the end, so to be able to open the PR, delete this keyword:*** yellow-man