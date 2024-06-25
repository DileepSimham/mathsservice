package boris.maths;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public Result doAddition(int no1, int no2){
        return new Result(no1+no2,"Finish Addition");
    }
}
