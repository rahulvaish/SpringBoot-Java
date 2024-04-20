On first Hit:

<img width="746" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/fe749372-b6b8-45b9-8b42-6c82309c801f">
<img width="488" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/06da2867-7279-4a96-a31e-88a4b51067ac">

____________________________________________________________________


When Service B is down:
<br>
Because sliding-window-size: 10 and failure-rate-threshold: 50 that means out of 10 if 5 failed the circuit will jump to Open state
<img width="745" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/ca81ccae-1200-4d41-894d-338437e38f02">
<img width="532" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/2fd290af-c52c-4210-978c-0621458dd849">

____________________________________________________________________


In Open state, after 5 seconds it turns into Half Open state, now try 3 times (because wait-duration-in-open-state: 5000ms and  permitted-number-of-calls-in-half-open-state: 3)
<br>
If 2/3 pass -> Circuit Open, else, Circuit Closed.
<br>
In my case, I kept Service B shut, so circuit got open:
<br>
<img width="519" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/72409ff0-eda0-4099-88fd-165b57720e2b">


____________________________________________________________________

Now, I turned the ServiceB up and running, and after 5 seconds (In Half Open state) I tried 3 times (because wait-duration-in-open-state: 5000ms and  permitted-number-of-calls-in-half-open-state: 3)
<br>
All 3/3 pass -> Circuit Closed.
<img width="749" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/19049681-505e-4984-8dc9-5250efee70df">
<img width="509" alt="image" src="https://github.com/rahulvaish/SpringBoot-Java/assets/689226/2a205c3f-fd31-45ad-9766-00ed37c18fab">

Note: While n/3 hits were in attempt the circuit was in half open state.
