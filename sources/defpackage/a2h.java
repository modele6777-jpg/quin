package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2h extends r2h {
    public final qtg a;
    public final int b;

    public a2h(wug wugVar) throws y1h {
        wugVar.getClass();
        this.a = wugVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            qtg qtgVar = this.a;
            if (i >= qtgVar.size()) {
                break;
            }
            int iB = ((r2h) qtgVar.get(i)).b();
            if (i2 < iB) {
                i2 = iB;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new y1h("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.r2h
    public final int a() {
        return r2h.d((byte) -128);
    }

    @Override // defpackage.r2h
    public final int b() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        r2h r2hVar = (r2h) obj;
        int iA = r2hVar.a();
        int iD = r2h.d((byte) -128);
        if (iD != iA) {
            return iD - r2hVar.a();
        }
        qtg qtgVar = ((a2h) r2hVar).a;
        qtg qtgVar2 = this.a;
        if (qtgVar2.size() != qtgVar.size()) {
            return qtgVar2.size() - qtgVar.size();
        }
        for (int i = 0; i < qtgVar2.size(); i++) {
            int iCompareTo = ((r2h) qtgVar2.get(i)).compareTo((r2h) qtgVar.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a2h.class == obj.getClass()) {
            return this.a.equals(((a2h) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(r2h.d((byte) -128)), this.a});
    }

    public final String toString() {
        qtg qtgVar = this.a;
        if (qtgVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = qtgVar.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((r2h) qtgVar.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(w1e.o(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(w1e.o(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            qc0.i(e);
            return null;
        }
    }
}
