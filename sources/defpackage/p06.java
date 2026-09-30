package defpackage;

import com.adjust.sdk.Constants;
import java.net.URI;
import tech.chatmind.api.guestpass.GuestPassInfoResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p06 {
    public final zf6 a;

    public p06(zf6 zf6Var) {
        this.a = zf6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        o06 o06Var;
        Object dzbVar;
        String host;
        if (zn2Var instanceof o06) {
            o06Var = (o06) zn2Var;
            int i = o06Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                o06Var.label = i - Integer.MIN_VALUE;
            } else {
                o06Var = new o06(this, zn2Var);
            }
        } else {
            o06Var = new o06(this, zn2Var);
        }
        Object objA = o06Var.result;
        int i2 = o06Var.label;
        boolean z = true;
        if (i2 == 0) {
            jzb.q(objA);
            o06Var.L$0 = this;
            o06Var.label = 1;
            objA = ((bg6) this.a).a(o06Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (p06) o06Var.L$0;
            jzb.q(objA);
        }
        GuestPassInfoResponse guestPassInfoResponse = (GuestPassInfoResponse) objA;
        this.getClass();
        if (guestPassInfoResponse.getRemaining() < 0) {
            throw new vz5(wz5.a);
        }
        if (guestPassInfoResponse.getTotalGranted() < 0) {
            throw new vz5(wz5.b);
        }
        if (guestPassInfoResponse.getTotalGranted() < guestPassInfoResponse.getRemaining()) {
            throw new vz5(wz5.c);
        }
        if (guestPassInfoResponse.getCreditsPerPass() <= 0) {
            throw new vz5(wz5.d);
        }
        if (guestPassInfoResponse.getValidDays() <= 0) {
            throw new vz5(wz5.e);
        }
        if (guestPassInfoResponse.getTotalGranted() > 0 && v4e.Q(guestPassInfoResponse.getCode())) {
            throw new vz5(wz5.f);
        }
        if (guestPassInfoResponse.getTotalGranted() > 0 && v4e.Q(guestPassInfoResponse.getShareUrl())) {
            throw new vz5(wz5.g);
        }
        if (guestPassInfoResponse.getTotalGranted() > 0) {
            try {
                URI uri = new URI(guestPassInfoResponse.getShareUrl());
                if (!uri.isAbsolute() || (host = uri.getHost()) == null || v4e.Q(host) || (!c5e.v(uri.getScheme(), "http", true) && !c5e.v(uri.getScheme(), Constants.SCHEME, true))) {
                    z = false;
                }
                dzbVar = Boolean.valueOf(z);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            Object obj = Boolean.FALSE;
            if (dzbVar instanceof dzb) {
                dzbVar = obj;
            }
            if (!((Boolean) dzbVar).booleanValue()) {
                throw new vz5(wz5.v);
            }
        }
        return new l06(guestPassInfoResponse.getCode(), guestPassInfoResponse.getShareUrl(), guestPassInfoResponse.getRemaining(), guestPassInfoResponse.getTotalGranted(), guestPassInfoResponse.getCreditsPerPass(), guestPassInfoResponse.getValidDays());
    }
}
