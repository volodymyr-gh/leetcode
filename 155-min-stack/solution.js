function StackEl(val, min, next) {
  this.val = val;
  this.min = min;
  this.next = next || null;
}

var MinStack = function() {
  this._head = null;
};

/**
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function(val) {
  this._head = new StackEl(
    val,
    this._head ? Math.min(val, this._head.min) : val,
    this._head
  );
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function() {
  var currHead = this._head;
  this._head = this._head.next;
  currHead.next = null;
};

/**
 * @return {number}
 */
MinStack.prototype.top = function() {
  return this._head ? this._head.val : -1;
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function() {
  return this._head ? this._head.min : -1;
};

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */
