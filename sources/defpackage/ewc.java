package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ewc extends gbe implements l26 {
    final /* synthetic */ mmb $selectionInSelectable;
    final /* synthetic */ lmb $targetSelectableId;
    final /* synthetic */ mmb $textInSelectable;
    int label;
    final /* synthetic */ fwc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewc(fwc fwcVar, mmb mmbVar, mmb mmbVar2, lmb lmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fwcVar;
        this.$textInSelectable = mmbVar;
        this.$selectionInSelectable = mmbVar2;
        this.$targetSelectableId = lmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ewc(this.this$0, this.$textInSelectable, this.$selectionInSelectable, this.$targetSelectableId, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        eue eueVar;
        long j;
        x59 x59Var;
        ste steVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            rfa rfaVar = this.this$0.J0;
            if (rfaVar != null) {
                CharSequence charSequence = (CharSequence) this.$textInSelectable.element;
                long j2 = ((eue) this.$selectionInSelectable.element).a;
                this.label = 1;
                obj = ((yfa) rfaVar).f(charSequence, j2, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                eueVar = null;
            }
            wef wefVar = wef.a;
            if (eueVar != null) {
                j = eueVar.a;
                if (!eue.b(j, this.$selectionInSelectable.element) && (x59Var = (x59) this.this$0.a.c.e(this.$targetSelectableId.element)) != null && x59Var.e() == this.$textInSelectable.element && (steVar = (ste) x59Var.c.invoke()) != null) {
                    int i2 = (int) (j >> 32);
                    uuc uucVar = new uuc(gcc.q(steVar, i2), i2, this.$targetSelectableId.element);
                    int i3 = (int) (j & 4294967295L);
                    txb txbVarQ = gcc.q(steVar, i3);
                    long j3 = this.$targetSelectableId.element;
                    vuc vucVar = new vuc(uucVar, new uuc(txbVarQ, i3, j3), false);
                    owc owcVar = this.this$0.a;
                    y69 y69Var = of8.a;
                    y69 y69Var2 = new y69();
                    y69Var2.i(j3, vucVar);
                    owcVar.k.setValue(y69Var2);
                    this.this$0.d.d(vucVar);
                    this.this$0.G0 = null;
                }
            }
            return wefVar;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        eueVar = (eue) obj;
        wef wefVar2 = wef.a;
        if (eueVar != null) {
            j = eueVar.a;
            if (!eue.b(j, this.$selectionInSelectable.element)) {
                int i4 = (int) (j >> 32);
                uuc uucVar2 = new uuc(gcc.q(steVar, i4), i4, this.$targetSelectableId.element);
                int i5 = (int) (j & 4294967295L);
                txb txbVarQ2 = gcc.q(steVar, i5);
                long j4 = this.$targetSelectableId.element;
                vuc vucVar2 = new vuc(uucVar2, new uuc(txbVarQ2, i5, j4), false);
                owc owcVar2 = this.this$0.a;
                y69 y69Var3 = of8.a;
                y69 y69Var4 = new y69();
                y69Var4.i(j4, vucVar2);
                owcVar2.k.setValue(y69Var4);
                this.this$0.d.d(vucVar2);
                this.this$0.G0 = null;
            }
        }
        return wefVar2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ewc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
