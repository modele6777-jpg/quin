package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jhh extends ckg {
    public final Map b;

    public jhh(mxb mxbVar, mxb mxbVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, mxbVar);
        d(linkedHashMap, mxbVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((ngh) entry.getKey()).c) {
                entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void d(LinkedHashMap linkedHashMap, mxb mxbVar) {
        for (int i = 0; i < mxbVar.m(); i++) {
            ngh nghVarO = mxbVar.o(i);
            Object obj = linkedHashMap.get(nghVarO);
            boolean z = nghVarO.c;
            Class cls = nghVarO.b;
            if (z) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(nghVarO, arrayList);
                }
                arrayList.add(cls.cast(mxbVar.q(i)));
            } else {
                linkedHashMap.put(nghVarO, cls.cast(mxbVar.q(i)));
            }
        }
    }

    @Override // defpackage.ckg
    public final void a(fhh fhhVar, ahh ahhVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ngh nghVar = (ngh) entry.getKey();
            Object value = entry.getValue();
            if (nghVar.c) {
                fhhVar.b(nghVar, ((List) value).iterator(), ahhVar);
            } else {
                fhhVar.a(nghVar, value, ahhVar);
            }
        }
    }

    @Override // defpackage.ckg
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.ckg
    public final Set c() {
        return this.b.keySet();
    }
}
