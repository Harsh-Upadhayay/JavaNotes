import Calculate.Sum;
import Number.Check;
import java.util.*;

public class demo {
	Sum sumObj = new Sum(50);
	System.out.println(sumObj.getSum());
	
	Check checkObj = new Check(555);
	System.out.println(checkObj.isZero() + checkObj.isEven());
}
