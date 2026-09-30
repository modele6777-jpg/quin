package defpackage;

import tech.chatmind.api.BasicRequest;
import tech.chatmind.api.UseCodeRequest;
import tech.chatmind.api.server.ServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bc7 {
    public final kb7 a;

    public bc7(kb7 kb7Var) {
        this.a = kb7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bd, code lost:
    
        if (((defpackage.v4e.Q(r9) || defpackage.v4e.Q(r10)) ? defpackage.wef.a : defpackage.ypa.a.a(new defpackage.u8d(r9, r10, null), r0)) == r6) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r10, defpackage.zn2 r11) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bc7.a(java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(BasicRequest basicRequest, zn2 zn2Var) {
        zb7 zb7Var;
        if (zn2Var instanceof zb7) {
            zb7Var = (zb7) zn2Var;
            int i = zb7Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zb7Var.label = i - Integer.MIN_VALUE;
            } else {
                zb7Var = new zb7(this, zn2Var);
            }
        } else {
            zb7Var = new zb7(this, zn2Var);
        }
        Object objA = zb7Var.result;
        int i2 = zb7Var.label;
        if (i2 == 0) {
            jzb.q(objA);
            zb7Var.L$0 = null;
            zb7Var.label = 1;
            objA = this.a.a(basicRequest, zb7Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objA);
        }
        ServerResponse serverResponse = (ServerResponse) objA;
        if (serverResponse.getSuccess()) {
            return serverResponse.getData();
        }
        qc0.p("Check failed.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, String str2, zn2 zn2Var) throws Throwable {
        ac7 ac7Var;
        Object dzbVar;
        if (zn2Var instanceof ac7) {
            ac7Var = (ac7) zn2Var;
            int i = ac7Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac7Var.label = i - Integer.MIN_VALUE;
            } else {
                ac7Var = new ac7(this, zn2Var);
            }
        } else {
            ac7Var = new ac7(this, zn2Var);
        }
        Object objB = ac7Var.result;
        int i2 = ac7Var.label;
        wef wefVar = wef.a;
        try {
            if (i2 == 0) {
                jzb.q(objB);
                kb7 kb7Var = this.a;
                UseCodeRequest useCodeRequest = new UseCodeRequest(str, str2);
                ac7Var.L$0 = null;
                ac7Var.L$1 = null;
                ac7Var.L$2 = null;
                ac7Var.label = 1;
                objB = kb7Var.b(useCodeRequest, ac7Var);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objB);
            }
            if (!((ServerResponse) objB).getSuccess()) {
                throw new IllegalStateException("Check failed.");
            }
            dzbVar = wefVar;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA == null) {
            return wefVar;
        }
        throw nzc.b(thA);
    }
}
