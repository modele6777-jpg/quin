package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ek4 extends czb implements l26 {
    final /* synthetic */ mmb $currentDown;
    final /* synthetic */ imb $deepPress;
    final /* synthetic */ mmb $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek4(imb imbVar, mmb mmbVar, mmb mmbVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$deepPress = imbVar;
        this.$currentDown = mmbVar;
        this.$longPress = mmbVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ek4 ek4Var = new ek4(this.$deepPress, this.$currentDown, this.$longPress, xn2Var);
        ek4Var.L$0 = obj;
        return ek4Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067 A[LOOP:2: B:16:0x0058->B:20:0x0067, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006b A[EDGE_INSN: B:74:0x006b->B:22:0x006b BREAK  A[LOOP:2: B:16:0x0058->B:20:0x0067], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b1 -> B:39:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ek4) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
