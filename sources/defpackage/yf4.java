package defpackage;

import ai.askquin.ui.conversation.r0;
import java.time.Instant;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.SubmitSpreadRequest;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yf4 extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ SubmitSpreadRequest $request;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf4(r0 r0Var, String str, SubmitSpreadRequest submitSpreadRequest, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$chatId = str;
        this.$request = submitSpreadRequest;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yf4(this.this$0, this.$chatId, this.$request, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009b A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:7:0x001d, B:29:0x0090, B:31:0x009b, B:33:0x00a3, B:35:0x00ae, B:36:0x00b3), top: B:48:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a3 A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:7:0x001d, B:29:0x0090, B:31:0x009b, B:33:0x00a3, B:35:0x00ae, B:36:0x00b3), top: B:48:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ae A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:7:0x001d, B:29:0x0090, B:31:0x009b, B:33:0x00a3, B:35:0x00ae, B:36:0x00b3), top: B:48:0x001d }] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        r0 r0Var;
        d99 d99Var;
        SubmitSpreadRequest submitSpreadRequest;
        String str;
        d99 d99Var2;
        String str2;
        r0 r0Var2;
        fc4 fc4Var;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i == 0) {
                    jzb.q(obj);
                    r0Var = this.this$0;
                    f99 f99Var = r0Var.n1;
                    String str3 = this.$chatId;
                    SubmitSpreadRequest submitSpreadRequest2 = this.$request;
                    this.L$0 = f99Var;
                    this.L$1 = r0Var;
                    this.L$2 = str3;
                    this.L$3 = submitSpreadRequest2;
                    this.label = 1;
                    if (f99Var.b(this) != bw2Var) {
                        d99Var = f99Var;
                        submitSpreadRequest = submitSpreadRequest2;
                        str = str3;
                    }
                    return bw2Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    submitSpreadRequest = (SubmitSpreadRequest) this.L$3;
                    str2 = (String) this.L$2;
                    r0Var2 = (r0) this.L$1;
                    d99Var2 = (d99) this.L$0;
                    try {
                        jzb.q(obj);
                        r0Var2.o1 = new iy9(str2, submitSpreadRequest);
                        fc4Var = r0Var2.H0;
                        if (fc4Var != null) {
                            pa7.g0("divinationKey");
                            throw null;
                        }
                        if (pa7.t(fc4Var.a, str2)) {
                            r0Var2.X1 = Instant.now();
                            r0Var2.q1();
                        }
                        d99Var = d99Var2;
                        d99Var.h(null);
                        return wef.a;
                    } catch (Throwable th) {
                        th = th;
                        d99Var2.h(null);
                        throw th;
                    }
                }
                submitSpreadRequest = (SubmitSpreadRequest) this.L$3;
                str = (String) this.L$2;
                r0 r0Var3 = (r0) this.L$1;
                d99Var = (d99) this.L$0;
                jzb.q(obj);
                r0Var = r0Var3;
                if (!pa7.t(r0Var.o1, new iy9(str, submitSpreadRequest))) {
                    yt6 yt6Var = r0Var.d;
                    UserSelectedSpread userSelectedSpread = submitSpreadRequest.getUserSelectedSpread();
                    CloudMixedDeckSnapshot mixedDeckSnapshot = submitSpreadRequest.getMixedDeckSnapshot();
                    this.L$0 = d99Var;
                    this.L$1 = r0Var;
                    this.L$2 = str;
                    this.L$3 = submitSpreadRequest;
                    this.label = 2;
                    if (((uke) yt6Var).k(str, userSelectedSpread, mixedDeckSnapshot, this) != bw2Var) {
                        str2 = str;
                        d99Var2 = d99Var;
                        r0Var2 = r0Var;
                        r0Var2.o1 = new iy9(str2, submitSpreadRequest);
                        fc4Var = r0Var2.H0;
                        if (fc4Var != null) {
                            pa7.g0("divinationKey");
                            throw null;
                        }
                        if (pa7.t(fc4Var.a, str2)) {
                            r0Var2.X1 = Instant.now();
                            r0Var2.q1();
                        }
                        d99Var = d99Var2;
                    }
                    return bw2Var;
                }
                d99Var.h(null);
                return wef.a;
            } catch (Throwable th2) {
                th = th2;
                d99Var2 = d99Var;
                d99Var2.h(null);
                throw th;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            this.this$0.d().c("Failed to upload completed draw: chatId=" + this.$chatId, e2);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yf4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
