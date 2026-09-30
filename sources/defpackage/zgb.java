package defpackage;

import tech.chatmind.api.ReadingShareRequest;
import tech.chatmind.api.ReadingShareResponse;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zgb {
    public final tgb a;
    public final t7 b;

    public zgb(tgb tgbVar, t7 t7Var) {
        this.a = tgbVar;
        this.b = t7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, String str4, zn2 zn2Var) {
        ygb ygbVar;
        String shareUrl;
        if (zn2Var instanceof ygb) {
            ygbVar = (ygb) zn2Var;
            int i = ygbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ygbVar.label = i - Integer.MIN_VALUE;
            } else {
                ygbVar = new ygb(this, zn2Var);
            }
        } else {
            ygbVar = new ygb(this, zn2Var);
        }
        Object objA = ygbVar.result;
        int i2 = ygbVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            if (v4e.Q(str)) {
                qc0.j("Failed requirement.");
                return null;
            }
            mo3 mo3Var = (mo3) this.b;
            if (!mo3Var.b()) {
                qc0.p("Check failed.");
                return null;
            }
            ReadingShareRequest readingShareRequest = new ReadingShareRequest(mo3Var.a(), str2, str3, "qr", str4);
            ygbVar.L$0 = null;
            ygbVar.L$1 = null;
            ygbVar.L$2 = null;
            ygbVar.L$3 = null;
            ygbVar.label = 1;
            objA = this.a.a(str, readingShareRequest, ygbVar);
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
        NullableServerResponse nullableServerResponse = (NullableServerResponse) objA;
        if (!nullableServerResponse.getSuccess() || nullableServerResponse.getError()) {
            qc0.p("Reading sharing failed");
            return null;
        }
        ReadingShareResponse readingShareResponse = (ReadingShareResponse) nullableServerResponse.getData();
        if (readingShareResponse == null || (shareUrl = readingShareResponse.getShareUrl()) == null || v4e.Q(shareUrl)) {
            shareUrl = null;
        }
        if (shareUrl != null) {
            return shareUrl;
        }
        qc0.p("Reading share URL is missing");
        return null;
    }
}
