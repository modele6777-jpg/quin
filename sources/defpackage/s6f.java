package defpackage;

import tech.chatmind.api.PauseReadingAudioStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s6f extends gbe implements l26 {
    final /* synthetic */ long $activeSession;
    final /* synthetic */ String $chatId;
    final /* synthetic */ boolean $pauseAlreadyAwaited;
    final /* synthetic */ PauseReadingAudioStatus $settledPauseStatus;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ t6f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6f(boolean z, PauseReadingAudioStatus pauseReadingAudioStatus, t6f t6fVar, String str, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pauseAlreadyAwaited = z;
        this.$settledPauseStatus = pauseReadingAudioStatus;
        this.this$0 = t6fVar;
        this.$chatId = str;
        this.$activeSession = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new s6f(this.$pauseAlreadyAwaited, this.$settledPauseStatus, this.this$0, this.$chatId, this.$activeSession, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075 A[Catch: Exception -> 0x0029, CancellationException -> 0x01cb, TryCatch #2 {CancellationException -> 0x01cb, Exception -> 0x0029, blocks: (B:8:0x0022, B:46:0x013a, B:50:0x014d, B:52:0x0159, B:55:0x015f, B:57:0x0167, B:63:0x0178, B:64:0x0193, B:68:0x01b0, B:67:0x01a1, B:61:0x0173, B:62:0x0176, B:15:0x003e, B:42:0x00ff, B:43:0x0123, B:16:0x0043, B:25:0x0063, B:26:0x0065, B:29:0x0075, B:31:0x0083, B:33:0x008d, B:34:0x00ca, B:36:0x00d0, B:37:0x00d3, B:39:0x00ea, B:19:0x004c, B:21:0x0050, B:22:0x0053), top: B:78:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00d0 A[Catch: Exception -> 0x0029, CancellationException -> 0x01cb, TryCatch #2 {CancellationException -> 0x01cb, Exception -> 0x0029, blocks: (B:8:0x0022, B:46:0x013a, B:50:0x014d, B:52:0x0159, B:55:0x015f, B:57:0x0167, B:63:0x0178, B:64:0x0193, B:68:0x01b0, B:67:0x01a1, B:61:0x0173, B:62:0x0176, B:15:0x003e, B:42:0x00ff, B:43:0x0123, B:16:0x0043, B:25:0x0063, B:26:0x0065, B:29:0x0075, B:31:0x0083, B:33:0x008d, B:34:0x00ca, B:36:0x00d0, B:37:0x00d3, B:39:0x00ea, B:19:0x004c, B:21:0x0050, B:22:0x0053), top: B:78:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea A[Catch: Exception -> 0x0029, CancellationException -> 0x01cb, TryCatch #2 {CancellationException -> 0x01cb, Exception -> 0x0029, blocks: (B:8:0x0022, B:46:0x013a, B:50:0x014d, B:52:0x0159, B:55:0x015f, B:57:0x0167, B:63:0x0178, B:64:0x0193, B:68:0x01b0, B:67:0x01a1, B:61:0x0173, B:62:0x0176, B:15:0x003e, B:42:0x00ff, B:43:0x0123, B:16:0x0043, B:25:0x0063, B:26:0x0065, B:29:0x0075, B:31:0x0083, B:33:0x008d, B:34:0x00ca, B:36:0x00d0, B:37:0x00d3, B:39:0x00ea, B:19:0x004c, B:21:0x0050, B:22:0x0053), top: B:78:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0137, code lost:
    
        if (r0 == r10) goto L45;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6f.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((s6f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
