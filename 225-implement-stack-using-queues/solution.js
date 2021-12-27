
var MyStack = function() {
  this._q = [];
  this._tempQ = [];
};

/**
 * @param {number} x
 * @return {void}
 */
MyStack.prototype.push = function(x) {
  while (this._q.length) {
    this._tempQ.push(this._q.shift());
  }
  this._q.push(x);
  while (this._tempQ.length) {
    this._q.push(this._tempQ.shift());
  }
};

/**
 * @return {number}
 */
MyStack.prototype.pop = function() {
  return this._q.shift();
};

/**
 * @return {number}
 */
MyStack.prototype.top = function() {
  return this._q[0];
};

/**
 * @return {boolean}
 */
MyStack.prototype.empty = function() {
  return !this._q.length;
};

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = new MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */