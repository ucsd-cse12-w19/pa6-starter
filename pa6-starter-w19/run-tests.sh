JARS=lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:lib/jfreechart.jar:lib/jcommon-1.0.23.jar

javac -cp $JARS:src/ src/cse12pa6student/*.java

java -cp $JARS:src/ org.junit.runner.JUnitCore cse12pa6student.LoaderTest 2>&1 | grep -v "\tat"
java -cp $JARS:src/ org.junit.runner.JUnitCore cse12pa6student.DefaultMapTest 2>&1 | grep -v "\tat"
