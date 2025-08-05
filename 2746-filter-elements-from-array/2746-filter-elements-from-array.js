/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    //  let ans=arr.filter(fn);
    //  return ans;
    let ans=[];
    for(let i=0;i<arr.length;i++){
        if(fn(arr[i],i,arr)){
            ans.push(arr[i]);
        }
    }
    return ans;

};