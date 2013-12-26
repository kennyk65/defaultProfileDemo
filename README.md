defaultProfileDemo
==================

This application demonstrates an undocumented Spring concept called a 'default' profile.

In short, the behavior is:
1.  Beans not assigned to a profile are always loaded.
2.  Beans assigned to a specific profile like 'aaa' or 'bbb' are only loaded if that specific profile is active.
3.  Beans in a specially named profile called 'default' are loaded only if no other profile is specifically activated.
