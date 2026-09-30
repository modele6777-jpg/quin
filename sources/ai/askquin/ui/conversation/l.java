package ai.askquin.ui.conversation;

import defpackage.aw2;
import defpackage.cm4;
import defpackage.ed4;
import defpackage.gbe;
import defpackage.l26;
import defpackage.wef;
import defpackage.xn2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends gbe implements l26 {
    final /* synthetic */ cm4 $context;
    final /* synthetic */ ed4 $questionState;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(cm4 cm4Var, r0 r0Var, ed4 ed4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = cm4Var;
        this.this$0 = r0Var;
        this.$questionState = ed4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l(this.$context, this.this$0, this.$questionState, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e5 A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00eb A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f3 A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8 A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0118 A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:63:0x011d A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x014d A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:72:0x015a A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194 A[Catch: Exception -> 0x0028, CancellationException -> 0x0208, TryCatch #2 {CancellationException -> 0x0208, Exception -> 0x0028, blocks: (B:8:0x0021, B:82:0x01a7, B:84:0x01c6, B:15:0x003d, B:79:0x0194, B:18:0x004a, B:49:0x00c7, B:51:0x00d4, B:53:0x00e5, B:59:0x010c, B:61:0x0118, B:64:0x0120, B:66:0x0146, B:75:0x0165, B:76:0x017b, B:69:0x014d, B:70:0x0151, B:72:0x015a, B:63:0x011d, B:55:0x00eb, B:57:0x00f3, B:58:0x00f8, B:21:0x0055, B:23:0x005b, B:25:0x0064, B:28:0x006e, B:30:0x007a, B:32:0x0080, B:45:0x00ae, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:40:0x00a1, B:42:0x00a7, B:50:0x00d0), top: B:91:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (r0 == r8) goto L81;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.conversation.l.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
