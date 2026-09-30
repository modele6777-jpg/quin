package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class tjd extends jgf implements vjd, c7f {
    @Override // defpackage.jgf
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public abstract tjd l0(boolean z);

    @Override // defpackage.jgf
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public abstract tjd n0(e7f e7fVar);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", jz3.e.o((u00) it.next(), null), "] "};
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(c0());
        if (!Z().isEmpty()) {
            s72.C0(Z(), sb, ", ", "<", ">", null, 112);
        }
        if (i0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
