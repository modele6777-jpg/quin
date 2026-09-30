package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jm8 extends gbe implements l26 {
    final /* synthetic */ s69 $animatingRef;
    final /* synthetic */ int $charsPerSecond;
    final /* synthetic */ s69 $displayedLength$delegate;
    final /* synthetic */ String $fullText;
    final /* synthetic */ h0e $onAnimatingChangedState;
    int I$0;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jm8(String str, int i, s69 s69Var, s69 s69Var2, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$fullText = str;
        this.$charsPerSecond = i;
        this.$displayedLength$delegate = s69Var;
        this.$animatingRef = s69Var2;
        this.$onAnimatingChangedState = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jm8(this.$fullText, this.$charsPerSecond, this.$displayedLength$delegate, this.$animatingRef, this.$onAnimatingChangedState, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        long j;
        int i;
        int i2 = this.label;
        wef wefVar = wef.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                int length = this.$fullText.length();
                int iJ = ((sz9) this.$displayedLength$delegate).j();
                s69 s69Var = this.$animatingRef;
                if (length <= iJ) {
                    z7f.m(s69Var, this.$onAnimatingChangedState, false);
                    return wefVar;
                }
                z7f.m(s69Var, this.$onAnimatingChangedState, true);
                long j2 = 1000 / ((long) this.$charsPerSecond);
                if (j2 < 1) {
                    j2 = 1;
                }
                j = j2;
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = this.J$0;
                jzb.q(obj);
            }
            while (((sz9) this.$displayedLength$delegate).j() < this.$fullText.length()) {
                int length2 = this.$fullText.length() - ((sz9) this.$displayedLength$delegate).j();
                if (length2 <= 0) {
                    i = 0;
                } else if (length2 > 240) {
                    i = length2 / 6;
                } else if (length2 > 80) {
                    i = length2 / 12;
                } else {
                    i = length2 / 24;
                    if (i < 1) {
                        i = 1;
                    }
                }
                s69 s69Var2 = this.$displayedLength$delegate;
                int iJ2 = ((sz9) s69Var2).j() + i;
                int length3 = this.$fullText.length();
                if (iJ2 > length3) {
                    iJ2 = length3;
                }
                ((sz9) s69Var2).k(iJ2);
                this.J$0 = j;
                this.I$0 = i;
                this.label = 1;
                Object objQ = vfh.q(j, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            }
            z7f.m(this.$animatingRef, this.$onAnimatingChangedState, false);
            return wefVar;
        } catch (Throwable th) {
            z7f.m(this.$animatingRef, this.$onAnimatingChangedState, false);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jm8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
