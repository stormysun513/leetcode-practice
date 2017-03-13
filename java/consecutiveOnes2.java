int secIdx;
int length = nums.length;
int count = 0;
int count1 = 0;
int count2 = 0;
int i = 0;

while(i < length && nums[i] == 0) i++;
if(i == length){
    return 1;
}
if(i != 0){
    count1 = 1;
}

while(i < length){
    count2 = 0;
    while(i < length && nums[i] == 1){
        i++;
        count2++;
    }
    count = Math.max(count, count1+count2);
    int s2 = i;

    while(i < length && nums[i] == 0) i++;
    if(i < length && i - s2 == 1){
        count1 = count2 + 1;
    }
    else if(i < length && i - s2 > 1){
        count1 = 1;
    }
    else if(i == length && i - s2 > 0){
        count = Math.max(count, count2+1);
    }
}
return count;
