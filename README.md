<h1>Programming in Java Lab Assignment 6 (Implmentation of Inheritance</h1>
<h2>Part 1: Implementation of Fixed and Growable Stack using Interface_STK</h2>
<h3>Interface_stk (Interface)</h3>
<ul>
        <li><code>push(int element)</code>: Adds an element to the stack.</li>
        <li><code>pop()</code>: Removes and returns the top element from the stack.</li>
        <li><code>displayStack()</code>: Displays all elements in the stack.</li>
        <li><code>overflow()</code>: Checks if the stack is full.</li>
        <li><code>underflow()</code>: Checks if the stack is empty.</li>
 </ul>

 <h3>Fixed_stk (Class)</h3>
    <ul>
        <li>Implements the <code>Interface_stk</code>.</li>
        <li>Represents a fixed-size stack.</li>
        <li>Uses an array to store stack elements.</li>
        <li>Operations: push, pop, displayStack.</li>
        <li>Checks for stack overflow and underflow conditions.</li>
    </ul>
<h3>Growable_stk (Class)</h3>
    <ul>
        <li>Implements the <code>Interface_stk</code>.</li>
        <li>Represents a growable stack.</li>
        <li>Uses an <code>ArrayList</code> to store stack elements.</li>
        <li>Operations: push, pop, displayStack.</li>
        <li>Does not check for stack overflow, but handles underflow condition.</li>
    </ul>

<h3>main (Class)</h3>
    <ul>
        <li>Demonstrates the usage of Fixed_stk and Growable_stk.</li>
        <li>Creates instances of both types of stacks.</li>
        <li>Pushes elements into each stack, pops elements, and displays the stacks.</li>
    </ul>

<h2>Part 2: Student and Result Calculation</h2>

 <h3>Student_part2 (Class)</h3>
    <ul>
        <li>Represents a student with name, roll number, and marks for two subjects.</li>
        <li>Provides getters and setters for each field.</li>
    </ul>
<h3>Exam (Interface)</h3>
    <ul>
        <li><code>Percent_cal()</code>: Calculates the percentage based on marks.</li>
    </ul>

<h3>Result_part2 (Class)</h3>
    <ul>
        <li>Extends <code>Student_part2</code> and implements <code>Exam</code>.</li>
        <li>Calculates the percentage using <code>Percent_cal()</code>.</li>
        <li>Displays the result including percentage, name, roll number, and marks.</li>
    </ul>
 <h3>main_2 (Class)</h3>
    <ul>
        <li>Demonstrates the usage of Result_part2.</li>
        <li>Creates an instance of Result_part2, passing student details and marks.</li>
        <li>Displays the result including the calculated percentage.</li>
    </ul>
