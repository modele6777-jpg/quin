package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nxg extends l0h {
    private static final nxg zzb;
    private v0h zzd = l3h.e;

    static {
        nxg nxgVar = new nxg();
        zzb = nxgVar;
        l0h.f(nxg.class, nxgVar);
    }

    public static mxg p() {
        return (mxg) zzb.k();
    }

    public static void q(nxg nxgVar, ArrayList arrayList) {
        v0h v0hVarU = nxgVar.zzd;
        if (!((fyg) v0hVarU).a) {
            int size = v0hVarU.size();
            v0hVarU = v0hVarU.u(size + size);
            nxgVar.zzd = v0hVarU;
        }
        int size2 = arrayList.size();
        if (v0hVarU instanceof ArrayList) {
            ((ArrayList) v0hVarU).ensureCapacity(v0hVarU.size() + size2);
        } else if (v0hVarU instanceof l3h) {
            l3h l3hVar = (l3h) v0hVarU;
            int i = l3hVar.c + size2;
            int length = l3hVar.b.length;
            if (i > length) {
                if (length != 0) {
                    while (length < i) {
                        length = xkg.d(length, 3, 2, 1, 10);
                    }
                    l3hVar.b = Arrays.copyOf(l3hVar.b, length);
                } else {
                    l3hVar.b = new Object[Math.max(i, 10)];
                }
            }
        }
        int size3 = v0hVarU.size();
        int size4 = arrayList.size();
        for (int i2 = 0; i2 < size4; i2++) {
            Object obj = arrayList.get(i2);
            if (obj == null) {
                String strF = tec.f(v0hVarU.size() - size3, "Element at index ", " is null.");
                int size5 = v0hVarU.size();
                while (true) {
                    size5--;
                    if (size5 < size3) {
                        r82.g(strF);
                        return;
                    }
                    v0hVarU.remove(size5);
                }
            } else {
                v0hVarU.add(obj);
            }
        }
    }

    @Override // defpackage.l0h
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new q3h(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", lxg.class});
        }
        if (i2 == 3) {
            return new nxg();
        }
        if (i2 == 4) {
            return new mxg(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
