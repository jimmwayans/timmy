/*     */ package com.sun.org.apache.xpath.internal.axes;
/*     */ 
/*     */ import com.sun.org.apache.xalan.internal.res.XSLMessages;
/*     */ import com.sun.org.apache.xml.internal.dtm.DTM;
/*     */ import com.sun.org.apache.xml.internal.dtm.DTMAxisTraverser;
/*     */ import com.sun.org.apache.xpath.internal.Expression;
/*     */ import com.sun.org.apache.xpath.internal.ExpressionOwner;
/*     */ import com.sun.org.apache.xpath.internal.XPathContext;
/*     */ import com.sun.org.apache.xpath.internal.XPathVisitor;
/*     */ import com.sun.org.apache.xpath.internal.compiler.Compiler;
/*     */ import java.util.Vector;
/*     */ import javax.xml.transform.TransformerException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AxesWalker
/*     */   extends PredicatedNodeTest
/*     */   implements Cloneable, PathComponent, ExpressionOwner
/*     */ {
/*     */   static final long serialVersionUID = -2966031951306601247L;
/*     */   private DTM m_dtm;
/*     */   transient int m_root;
/*     */   private transient int m_currentNode;
/*     */   transient boolean m_isFresh;
/*     */   protected AxesWalker m_nextWalker;
/*     */   AxesWalker m_prevWalker;
/*     */   protected int m_axis;
/*     */   protected DTMAxisTraverser m_traverser;
/*     */   
/*     */   public AxesWalker(LocPathIterator locPathIterator, int axis) {
/*  54 */     super(locPathIterator);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 569 */     this.m_root = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 574 */     this.m_currentNode = -1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 588 */     this.m_axis = -1;
/*     */     this.m_axis = axis;
/*     */   }
/*     */   
/*     */   public final WalkingIterator wi() {
/*     */     return (WalkingIterator)this.m_lpi;
/*     */   }
/*     */   
/*     */   public void init(Compiler compiler, int opPos, int stepType) throws TransformerException {
/*     */     initPredicateInfo(compiler, opPos);
/*     */   }
/*     */   
/*     */   public Object clone() throws CloneNotSupportedException {
/*     */     AxesWalker clone = (AxesWalker)super.clone();
/*     */     return clone;
/*     */   }
/*     */   
/*     */   AxesWalker cloneDeep(WalkingIterator cloneOwner, Vector<AxesWalker> cloneList) throws CloneNotSupportedException {
/*     */     AxesWalker clone = findClone(this, cloneList);
/*     */     if (null != clone)
/*     */       return clone; 
/*     */     clone = (AxesWalker)clone();
/*     */     clone.setLocPathIterator(cloneOwner);
/*     */     if (null != cloneList) {
/*     */       cloneList.addElement(this);
/*     */       cloneList.addElement(clone);
/*     */     } 
/*     */     if ((wi()).m_lastUsedWalker == this)
/*     */       cloneOwner.m_lastUsedWalker = clone; 
/*     */     if (null != this.m_nextWalker)
/*     */       clone.m_nextWalker = this.m_nextWalker.cloneDeep(cloneOwner, cloneList); 
/*     */     if (null != cloneList) {
/*     */       if (null != this.m_prevWalker)
/*     */         clone.m_prevWalker = this.m_prevWalker.cloneDeep(cloneOwner, cloneList); 
/*     */     } else if (null != this.m_nextWalker) {
/*     */       clone.m_nextWalker.m_prevWalker = clone;
/*     */     } 
/*     */     return clone;
/*     */   }
/*     */   
/*     */   static AxesWalker findClone(AxesWalker key, Vector<AxesWalker> cloneList) {
/*     */     if (null != cloneList) {
/*     */       int n = cloneList.size();
/*     */       for (int i = 0; i < n; i += 2) {
/*     */         if (key == cloneList.elementAt(i))
/*     */           return cloneList.elementAt(i + 1); 
/*     */       } 
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*     */   public void detach() {
/*     */     this.m_currentNode = -1;
/*     */     this.m_dtm = null;
/*     */     this.m_traverser = null;
/*     */     this.m_isFresh = true;
/*     */     this.m_root = -1;
/*     */   }
/*     */   
/*     */   public int getRoot() {
/*     */     return this.m_root;
/*     */   }
/*     */   
/*     */   public int getAnalysisBits() {
/*     */     int axis = getAxis();
/*     */     int bit = WalkerFactory.getAnalysisBitFromAxes(axis);
/*     */     return bit;
/*     */   }
/*     */   
/*     */   public void setRoot(int root) {
/*     */     XPathContext xctxt = wi().getXPathContext();
/*     */     this.m_dtm = xctxt.getDTM(root);
/*     */     this.m_traverser = this.m_dtm.getAxisTraverser(this.m_axis);
/*     */     this.m_isFresh = true;
/*     */     this.m_foundLast = false;
/*     */     this.m_root = root;
/*     */     this.m_currentNode = root;
/*     */     if (-1 == root)
/*     */       throw new RuntimeException(XSLMessages.createXPATHMessage("ER_SETTING_WALKER_ROOT_TO_NULL", null)); 
/*     */     resetProximityPositions();
/*     */   }
/*     */   
/*     */   public final int getCurrentNode() {
/*     */     return this.m_currentNode;
/*     */   }
/*     */   
/*     */   public void setNextWalker(AxesWalker walker) {
/*     */     this.m_nextWalker = walker;
/*     */   }
/*     */   
/*     */   public AxesWalker getNextWalker() {
/*     */     return this.m_nextWalker;
/*     */   }
/*     */   
/*     */   public void setPrevWalker(AxesWalker walker) {
/*     */     this.m_prevWalker = walker;
/*     */   }
/*     */   
/*     */   public AxesWalker getPrevWalker() {
/*     */     return this.m_prevWalker;
/*     */   }
/*     */   
/*     */   private int returnNextNode(int n) {
/*     */     return n;
/*     */   }
/*     */   
/*     */   protected int getNextNode() {
/*     */     if (this.m_foundLast)
/*     */       return -1; 
/*     */     if (this.m_isFresh) {
/*     */       this.m_currentNode = this.m_traverser.first(this.m_root);
/*     */       this.m_isFresh = false;
/*     */     } else if (-1 != this.m_currentNode) {
/*     */       this.m_currentNode = this.m_traverser.next(this.m_root, this.m_currentNode);
/*     */     } 
/*     */     if (-1 == this.m_currentNode)
/*     */       this.m_foundLast = true; 
/*     */     return this.m_currentNode;
/*     */   }
/*     */   
/*     */   public int nextNode() {
/*     */     int nextNode = -1;
/*     */     AxesWalker walker = wi().getLastUsedWalker();
/*     */     while (null != walker) {
/*     */       nextNode = walker.getNextNode();
/*     */       if (-1 == nextNode) {
/*     */         walker = walker.m_prevWalker;
/*     */         continue;
/*     */       } 
/*     */       if (walker.acceptNode(nextNode) != 1)
/*     */         continue; 
/*     */       if (null == walker.m_nextWalker) {
/*     */         wi().setLastUsedWalker(walker);
/*     */         break;
/*     */       } 
/*     */       AxesWalker prev = walker;
/*     */       walker = walker.m_nextWalker;
/*     */       walker.setRoot(nextNode);
/*     */       walker.m_prevWalker = prev;
/*     */     } 
/*     */     return nextNode;
/*     */   }
/*     */   
/*     */   public int getLastPos(XPathContext xctxt) {
/*     */     AxesWalker walker;
/*     */     int pos = getProximityPosition();
/*     */     try {
/*     */       walker = (AxesWalker)clone();
/*     */     } catch (CloneNotSupportedException cnse) {
/*     */       return -1;
/*     */     } 
/*     */     walker.setPredicateCount(this.m_predicateIndex);
/*     */     walker.setNextWalker((AxesWalker)null);
/*     */     walker.setPrevWalker((AxesWalker)null);
/*     */     WalkingIterator lpi = wi();
/*     */     AxesWalker savedWalker = lpi.getLastUsedWalker();
/*     */     try {
/*     */       lpi.setLastUsedWalker(walker);
/*     */       int next;
/*     */       while (-1 != (next = walker.nextNode()))
/*     */         pos++; 
/*     */     } finally {
/*     */       lpi.setLastUsedWalker(savedWalker);
/*     */     } 
/*     */     return pos;
/*     */   }
/*     */   
/*     */   public void setDefaultDTM(DTM dtm) {
/*     */     this.m_dtm = dtm;
/*     */   }
/*     */   
/*     */   public DTM getDTM(int node) {
/*     */     return wi().getXPathContext().getDTM(node);
/*     */   }
/*     */   
/*     */   public boolean isDocOrdered() {
/*     */     return true;
/*     */   }
/*     */   
/*     */   public int getAxis() {
/*     */     return this.m_axis;
/*     */   }
/*     */   
/*     */   public void callVisitors(ExpressionOwner owner, XPathVisitor visitor) {
/*     */     if (visitor.visitStep(owner, this)) {
/*     */       callPredicateVisitors(visitor);
/*     */       if (null != this.m_nextWalker)
/*     */         this.m_nextWalker.callVisitors(this, visitor); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public Expression getExpression() {
/*     */     return this.m_nextWalker;
/*     */   }
/*     */   
/*     */   public void setExpression(Expression exp) {
/*     */     exp.exprSetParent(this);
/*     */     this.m_nextWalker = (AxesWalker)exp;
/*     */   }
/*     */   
/*     */   public boolean deepEquals(Expression expr) {
/*     */     if (!super.deepEquals(expr))
/*     */       return false; 
/*     */     AxesWalker walker = (AxesWalker)expr;
/*     */     if (this.m_axis != walker.m_axis)
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */ }


/* Location:              /Users/timmy/timmy/OSWE/oswe/openCRX/rt.jar!/com/sun/org/apache/xpath/internal/axes/AxesWalker.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */