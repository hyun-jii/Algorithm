// 첫번째 방법 - 6644 ms	46.7 MB
var findDisappearedNumbers = function(nums) {
    var result = [];
    for(var i=1; i<=nums.length; i++) {
        if(!nums.includes(i)) {
            result.push(i);
        }
    }
    return result;
};

// 두번째 방법 - 124 ms	50.2 MB
var findDisappearedNumbers = function(nums) {
    var result = [];
    var set = new Set(nums);
    
    for(var i=1; i<=nums.length; i++) {
        if(!set.has(i)) {
            result.push(i);
        }
    }
    return result;
};
