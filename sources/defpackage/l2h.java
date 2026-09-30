package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2h extends r2h {
    public final int a;
    public final bug b;

    public l2h(bug bugVar) throws y1h {
        bugVar.getClass();
        this.b = bugVar;
        gff gffVarI = bugVar.entrySet().i();
        int i = 0;
        while (gffVarI.hasNext()) {
            Map.Entry entry = (Map.Entry) gffVarI.next();
            int iB = ((r2h) entry.getKey()).b();
            i = i < iB ? iB : i;
            int iB2 = ((r2h) entry.getValue()).b();
            if (i < iB2) {
                i = iB2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 > 8) {
            throw new y1h("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.r2h
    public final int a() {
        return r2h.d((byte) -96);
    }

    @Override // defpackage.r2h
    public final int b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        r2h r2hVar = (r2h) obj;
        int iA = r2hVar.a();
        int iD = r2h.d((byte) -96);
        if (iD != iA) {
            return iD - r2hVar.a();
        }
        bug bugVar = ((l2h) r2hVar).b;
        bug bugVar2 = this.b;
        if (bugVar2.d.size() != bugVar.d.size()) {
            return bugVar2.d.size() - bugVar.d.size();
        }
        gff gffVarI = bugVar2.entrySet().i();
        gff gffVarI2 = bugVar.entrySet().i();
        do {
            if (!gffVarI.hasNext() && !gffVarI2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) gffVarI.next();
            Map.Entry entry2 = (Map.Entry) gffVarI2.next();
            int iCompareTo2 = ((r2h) entry.getKey()).compareTo((r2h) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((r2h) entry.getValue()).compareTo((r2h) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l2h.class == obj.getClass()) {
            return this.b.equals(((l2h) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(r2h.d((byte) -96)), this.b});
    }

    public final String toString() {
        bug bugVar = this.b;
        if (bugVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gff gffVarI = bugVar.entrySet().i();
        while (gffVarI.hasNext()) {
            Map.Entry entry = (Map.Entry) gffVarI.next();
            linkedHashMap.put(((r2h) entry.getKey()).toString().replace("\n", "\n  "), ((r2h) entry.getValue()).toString().replace("\n", "\n  "));
        }
        w1e w1eVar = new w1e(18);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            uyb.E(sb, linkedHashMap.entrySet().iterator(), w1eVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            qc0.i(e);
            return null;
        }
    }
}
