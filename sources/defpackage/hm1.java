package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hm1 {
    public final List a;

    public hm1(List list) {
        if (list == null || list.isEmpty()) {
            qc0.j("Cannot set an empty CaptureStage list.");
            throw null;
        }
        this.a = Collections.unmodifiableList(new ArrayList(list));
    }
}
