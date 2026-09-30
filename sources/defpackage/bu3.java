package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bu3 {
    public final List a;

    public bu3(b0b b0bVar) {
        List listP = b0bVar.p();
        if (b0bVar.q()) {
            int iO = b0bVar.o();
            List listP2 = b0bVar.p();
            listP2.getClass();
            ArrayList arrayList = new ArrayList(t72.u(listP2, 10));
            int i = 0;
            for (Object obj : listP2) {
                int i2 = i + 1;
                if (i < 0) {
                    t72.Z();
                    throw null;
                }
                vza vzaVarK = (vza) obj;
                if (i >= iO) {
                    vzaVarK.getClass();
                    uza uzaVarR0 = vza.r0(vzaVarK);
                    uzaVarR0.d |= 2;
                    uzaVarR0.f = true;
                    vzaVarK = uzaVarR0.k();
                    if (!vzaVarK.b()) {
                        throw new qef();
                    }
                }
                arrayList.add(vzaVarK);
                i = i2;
            }
            listP = arrayList;
        }
        listP.getClass();
        this.a = listP;
    }

    public vza a(int i) {
        return (vza) this.a.get(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List b(os osVar) {
        String str;
        int i;
        List listSingletonList;
        d0a d0aVar = new d0a((byte[]) osVar.d);
        ArrayList arrayList = this.a;
        while (d0aVar.a() > 0) {
            int iZ = d0aVar.z();
            int iZ2 = d0aVar.b + d0aVar.z();
            if (iZ == 134) {
                arrayList = new ArrayList();
                int iZ3 = d0aVar.z() & 31;
                for (int i2 = 0; i2 < iZ3; i2++) {
                    String strX = d0aVar.x(3, StandardCharsets.UTF_8);
                    int iZ4 = d0aVar.z();
                    boolean z = (iZ4 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                    if (z) {
                        i = iZ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZ = (byte) d0aVar.z();
                    d0aVar.N(1);
                    if (z) {
                        boolean z2 = (bZ & 64) != 0;
                        byte[] bArr = d72.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    qr5 qr5Var = new qr5();
                    qr5Var.o = qv8.l(str);
                    qr5Var.d = strX;
                    qr5Var.O = i;
                    qr5Var.r = listSingletonList;
                    arrayList.add(new rr5(qr5Var));
                }
            }
            d0aVar.M(iZ2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public /* synthetic */ bu3(List list) {
        this.a = list;
    }
}
