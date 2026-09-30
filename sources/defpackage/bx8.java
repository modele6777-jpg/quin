package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bx8 extends gbe implements l26 {
    final /* synthetic */ List<TarotSkinIdentify> $pending;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ cx8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx8(cx8 cx8Var, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cx8Var;
        this.$pending = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bx8(this.this$0, this.$pending, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:189:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[Catch: all -> 0x0029, Exception -> 0x002c, CancellationException -> 0x002f, TryCatch #8 {CancellationException -> 0x002f, Exception -> 0x002c, blocks: (B:6:0x0020, B:36:0x00d3, B:38:0x00dd, B:40:0x00e1, B:22:0x0069, B:24:0x0070, B:29:0x008f, B:31:0x009c, B:32:0x00a5, B:81:0x0164, B:42:0x00e5, B:44:0x00f8, B:46:0x00fc, B:21:0x0060), top: B:185:0x000c, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[LOOP:1: B:22:0x0069->B:30:0x0099, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0209: INSTANCE_OF (r0 I:boolean) = (r13 I:??[OBJECT, ARRAY]) (LINE:522) java.lang.AutoCloseable, block:B:112:0x0209 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x025f: INSTANCE_OF (r1 I:boolean) = (r13 I:??[OBJECT, ARRAY]) (LINE:608) java.lang.AutoCloseable, block:B:145:0x025f */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cf -> B:36:0x00d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bx8.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bx8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
