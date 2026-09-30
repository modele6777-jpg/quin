package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import io.sentry.android.core.b1;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ur4 implements tr4 {
    public final DynamicRangeProfiles a;

    public ur4(DynamicRangeProfiles dynamicRangeProfiles) {
        this.a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return xu4.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            qr4 qr4Var = (qr4) rr4.a.get(Long.valueOf(jLongValue));
            if (qr4Var == null && b21.F(5, "CXCP")) {
                b1.l("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            }
            if (qr4Var != null) {
                linkedHashSet.add(qr4Var);
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // defpackage.tr4
    public final Set a() {
        Set<Long> supportedProfiles = this.a.getSupportedProfiles();
        supportedProfiles.getClass();
        return d(supportedProfiles);
    }

    @Override // defpackage.tr4
    public final DynamicRangeProfiles b() {
        return this.a;
    }

    @Override // defpackage.tr4
    public final Set c(qr4 qr4Var) {
        qr4Var.getClass();
        LinkedHashMap linkedHashMap = rr4.a;
        Long lA = rr4.a(qr4Var, this.a);
        if (lA == null) {
            ho7.y(qr4Var, "DynamicRange is not supported: ");
            return null;
        }
        Set<Long> profileCaptureRequestConstraints = this.a.getProfileCaptureRequestConstraints(lA.longValue());
        profileCaptureRequestConstraints.getClass();
        return d(profileCaptureRequestConstraints);
    }
}
