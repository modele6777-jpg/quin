package io.sentry.protocol;

import io.sentry.k2;
import io.sentry.m3;
import io.sentry.q6;
import io.sentry.z0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements k2 {
    public t a;
    public List b;
    public HashMap c;

    public static f a(f fVar, q6 q6Var) {
        DebugImage debugImage;
        ArrayList<DebugImage> arrayList = new ArrayList();
        if (q6Var.getProguardUuid() != null) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.PROGUARD);
            debugImage2.setUuid(q6Var.getProguardUuid());
            arrayList.add(debugImage2);
        }
        for (String str : q6Var.getBundleIds()) {
            DebugImage debugImage3 = new DebugImage();
            debugImage3.setType(DebugImage.JVM);
            debugImage3.setDebugId(str);
            arrayList.add(debugImage3);
        }
        if (fVar == null && arrayList.isEmpty()) {
            return null;
        }
        if (fVar == null) {
            fVar = new f();
        }
        if (!arrayList.isEmpty()) {
            if (fVar.b == null) {
                fVar.b(new ArrayList());
            }
            List list = fVar.b;
            if (list != null) {
                for (DebugImage debugImage4 : arrayList) {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            list.add(debugImage4);
                            break;
                        }
                        debugImage = (DebugImage) it.next();
                    } while (!(DebugImage.PROGUARD.equals(debugImage4.getType()) ? DebugImage.PROGUARD.equals(debugImage.getType()) : DebugImage.JVM.equals(debugImage4.getType()) && DebugImage.JVM.equals(debugImage.getType()) && debugImage4.getDebugId() != null && debugImage4.getDebugId().equals(debugImage.getDebugId())));
                }
            }
        }
        return fVar;
    }

    public final void b(List list) {
        this.b = list != null ? new ArrayList(list) : null;
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) throws IOException {
        io.sentry.internal.debugmeta.c cVar = (io.sentry.internal.debugmeta.c) m3Var;
        cVar.j();
        if (this.a != null) {
            cVar.q("sdk_info");
            cVar.w(z0Var, this.a);
        }
        if (this.b != null) {
            cVar.q("images");
            cVar.w(z0Var, this.b);
        }
        HashMap map = this.c;
        if (map != null) {
            for (String str : map.keySet()) {
                io.sentry.e.a(this.c, str, cVar, str, z0Var);
            }
        }
        cVar.m();
    }
}
