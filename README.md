# 4Clojure Sandbox

I am trying to learn [Clojure](http://clojure.org/), the amazing LISP that runs on the Java VM, on my own and I'm doing my best to practice coding in it as much as possible.

This is where I keep track of the terrible solutions I have constructed for the programming exercises on [4Clojure](https://4clojure.com). I do this to practice for...clojure.

## Tools I Use For This Endeavour

 - [lein](http://leiningen.org/) a fantastic tool with which to set up clojure projects automatically (and more)
 - [lein-fore-prob](https://github.com/bfontaine/lein-fore-prob)  a `lein` plugin that adds 4Clojure problems to an existing `lein` project
 - [cider-nrepl](https://github.com/clojure-emacs/cider-nrepl) (*v0.7.0-SNAPSHOT*) a `lein` plugin required by `cider` (see below)
 - [cider](https://github.com/clojure-emacs/cider) (*v0.7.0-ALPHA*) an emacs clojure IDE and in-editor `REPL`
 - [emacs 24](http://www.gnu.org/software/emacs/) the one and only LISP operating system

**NOTE** You need to have the same version of `cider-nrepl` (the `lein` repl middleware) installed as `cider` (the emacs plugin).

## Lein Profiles and Their Purpose

The `profiles.clj` file is a user-set configuration file with which you can specify plugins you want to use globally.

My `~/.lein/profiles.clj` looks like this:

``` clojure   
 {:user {:plugins [[cider/cider-nrepl "0.7.0-SNAPSHOT"]
                      [lein-fore-prob "0.1.2"]]}}
```

## Emacs Clojure Development
  
### Useful Shortcuts

| Shortcut                             | Description                                                                |
| :------------                            | :-----------                                                                      | 
| <kbd>C-c M-n</kbd>    | Switch to the namespace in the current buffer.  |
|<kbd>C-c C-k</kbd>      | Compile the current buffer.                                    |
|<kbd>C-c C-z</kdb>      | Switch to and from the `repl` buffer.                      |
 
### My Workflow

1. Open `core.clj` in this code directory in `emacs`. 
2. Run `cider-jack-in` to start up the `REPL`.
3. Switch back to the `core.clj` file buffer. Compile this buffer.
4. Open the `core_test.clj` file. Compile this buffer.
5. Switch to the `core-test` namespace in the `repl`.
6. Type in `(run-tests)` at the `repl` to..run tests.
7. Solve the problem in `core.clj`, then re-compile that buffer. 
8. Run tests again and hope everything passes.
9. If tests are green, add a new `4clojure` problem: `lein fore-prob <id of problem>`
10. Repeat the above.



 





