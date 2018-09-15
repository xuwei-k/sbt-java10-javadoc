reproduce sbt bug https://github.com/sbt/sbt/issues/4350

- https://travis-ci.org/xuwei-k/sbt-java10-javadoc/builds/428916476
- https://github.com/sbt/zinc/blob/v1.2.2/internal/zinc-compile-core/src/main/scala/sbt/internal/inc/javac/LocalJava.scala#L42-L77

## Java 8

```
[info]Running Test
Loading source file A.java...
Constructing Javadoc information...
Creating destination directory: "output_dir/"
Standard Doclet version 1.8.0_151
Building tree for all the packages and classes...
Generating output_dir/A.html...
Generating output_dir/package-frame.html...
Generating output_dir/package-summary.html...
Generating output_dir/package-tree.html...
Generating output_dir/constant-values.html...
Building index for all the packages and classes...
Generating output_dir/overview-tree.html...
Generating output_dir/index-all.html...
Generating output_dir/deprecated-list.html...
Building index for all classes...
Generating output_dir/allclasses-frame.html...
Generating output_dir/allclasses-noframe.html...
Generating output_dir/index.html...
Generating output_dir/help-doc.html...
res = 0
```

## Java 10

```
[info]Running Test
javadoc: error - invalid flag: -d
Usage: javadoc [options] [packagenames] [sourcefiles] [@files]
  -overview <file>                 Read overview documentation from HTML file
  -public                          Show only public classes and members
  -protected                       Show protected/public classes and members (default)
  -package                         Show package/protected/public classes and members
  -private                         Show all classes and members
  -help                            Display command line options and exit
  -doclet <class>                  Generate output via alternate doclet
  -docletpath <path>               Specify where to find doclet class files
  --module-source-path <path>      Specify where to find input source files for multiple modules
  --upgrade-module-path <path>     Override location of upgradeable modules
  --module-path <path>, -p <path>  Specify where to find application modules
  --add-modules <module>(,<module>)*
                                   Root modules to resolve in addition to the initial modules
                                   or all modules on the module path if <module> is ALL-MODULE-PATH.
  --limit-modules <module>(,<module>)*
                                   Limit the universe of observable modules
  --source-path <path>             Specify where to find source files
  -sourcepath <path>               Specify where to find source files
  --class-path <path>              Specify where to find user class files
  -classpath <path>                Specify where to find user class files
  -cp <path>                       Specify where to find user class files
  -exclude <pkglist>               Specify a list of packages to exclude
  -subpackages <subpkglist>        Specify subpackages to recursively load
  -breakiterator                   Compute first sentence with BreakIterator
  -bootclasspath <path>            Override location of platform class files
                                   used for non-modular releases
  --system <jdk>                   Override location of system modules used
                                   for modular releases.
  -source <release>                Provide source compatibility with specified release
  --release <release>              Provide source compatibility with specified release
  -extdirs <dirlist>               Override location of installed extensions
  -verbose                         Output messages about what Javadoc is doing
  -locale <name>                   Locale to be used, e.g. en_US or en_US_WIN
  -encoding <name>                 Source file encoding name
  -quiet                           Do not display status messages
  -J<flag>                         Pass <flag> directly to the runtime system
  -X                               Print a synopsis of nonstandard options and exit
GNU-style options may use = instead whitespace to separate the name of an option
from its value.
1 error
res = 1
```
