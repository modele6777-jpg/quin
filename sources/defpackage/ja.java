package defpackage;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.User;
import tech.chatmind.api.UserInfo;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ja extends gbe implements l26 {
    final /* synthetic */ String $code;
    final /* synthetic */ String $phoneNumber;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ cb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(cb cbVar, String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = cbVar;
        this.$phoneNumber = str;
        this.$code = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ja jaVar = new ja(this.this$0, this.$phoneNumber, this.$code, xn2Var);
        jaVar.L$0 = obj;
        return jaVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:32:0x00a2, B:34:0x00aa, B:35:0x00b4, B:14:0x003d, B:21:0x005e, B:23:0x0066, B:25:0x006c, B:26:0x0075, B:28:0x008e, B:17:0x004a), top: B:61:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4 A[Catch: all -> 0x002c, TRY_LEAVE, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0027, B:32:0x00a2, B:34:0x00aa, B:35:0x00b4, B:14:0x003d, B:21:0x005e, B:23:0x0066, B:25:0x006c, B:26:0x0075, B:28:0x008e, B:17:0x004a), top: B:61:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x010a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        cb cbVar;
        Throwable thA;
        Throwable thB;
        Throwable cause;
        cb cbVar2;
        cb cbVar3;
        User user;
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        Object obj2 = x62.a;
        z62 z62Var = z62.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                cb cbVar4 = this.this$0;
                String str = this.$phoneNumber;
                String str2 = this.$code;
                d56 d56Var = cbVar4.a;
                this.L$0 = null;
                this.L$1 = cbVar4;
                this.L$2 = aw2Var;
                this.label = 1;
                Object objD = d56Var.d(str, str2, this);
                if (objD != bw2Var) {
                    cbVar2 = cbVar4;
                    obj = objD;
                }
                return bw2Var;
            }
            if (i == 1) {
                aw2Var = (aw2) this.L$2;
                cbVar2 = (cb) this.L$1;
                jzb.q(obj);
            } else {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cbVar3 = (cb) this.L$1;
                jzb.q(obj);
            }
            user = ((UserInfo) obj).getUser();
            if (user == null) {
                cbVar3.d().b("bind phone response has no user");
                dzbVar = z62Var;
            } else {
                dzbVar = new w62(user);
            }
            cbVar = this.this$0;
            thA = ezb.a(dzbVar);
            if (thA == null) {
                return dzbVar;
            }
            if (!(thA instanceof CancellationException)) {
                throw thA;
            }
            ynb.h0(thA);
            int i2 = cb.b;
            cbVar.getClass();
            thB = nzc.b(thA);
            if ((thB instanceof jzc) || ((jzc) thB).getErrorCode() != 10017) {
                for (cause = thB; cause != null; cause = cause.getCause()) {
                    if (!(cause instanceof IOException) || cause.getClass().getName().equals("android.system.GaiException")) {
                        cbVar.d().c("bind phone network error", thB);
                        obj2 = y62.a;
                        break;
                    }
                }
                cbVar.d().c("bind phone server error", thB);
                obj2 = z62Var;
                break;
            } else {
                cbVar.d().e("bind phone rejected because the verification code is invalid");
            }
            return obj2;
            ServerResponse serverResponse = (ServerResponse) obj;
            if (serverResponse.getSuccess()) {
                d56 d56Var2 = cbVar2.a;
                this.L$0 = null;
                this.L$1 = cbVar2;
                this.L$2 = aw2Var;
                this.L$3 = null;
                this.label = 2;
                obj = d56Var2.e(this);
                if (obj != bw2Var) {
                    cbVar3 = cbVar2;
                    user = ((UserInfo) obj).getUser();
                    if (user == null) {
                        cbVar3.d().b("bind phone response has no user");
                        dzbVar = z62Var;
                    } else {
                        dzbVar = new w62(user);
                    }
                }
                return bw2Var;
            }
            if (serverResponse.getErrorCode() == 10017) {
                cbVar2.d().e("bind phone rejected because the verification code is invalid");
                dzbVar = obj2;
            } else {
                cbVar2.d().b("bind phone failed: code=" + serverResponse.getErrorCode());
                dzbVar = z62Var;
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        cbVar = this.this$0;
        thA = ezb.a(dzbVar);
        if (thA == null) {
            return dzbVar;
        }
        if (!(thA instanceof CancellationException)) {
            throw thA;
        }
        ynb.h0(thA);
        int i3 = cb.b;
        cbVar.getClass();
        thB = nzc.b(thA);
        if (thB instanceof jzc) {
            while (true) {
                if (cause instanceof IOException) {
                }
                cbVar.d().c("bind phone network error", thB);
                obj2 = y62.a;
            }
        } else {
            while (true) {
                if (cause instanceof IOException) {
                }
                cbVar.d().c("bind phone network error", thB);
                obj2 = y62.a;
            }
        }
        return obj2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ja) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
