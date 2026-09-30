package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pb2 implements idc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.idc
    public final Bundle a() {
        iy9[] iy9VarArr;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                tb2 tb2Var = ((vb2) obj).w;
                tb2Var.getClass();
                LinkedHashMap linkedHashMap = tb2Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(tb2Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(tb2Var.g));
                return bundle;
            case 1:
                Map mapD = ((vcc) obj).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : mapD.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
            case 2:
                nx5 nx5Var = (nx5) obj;
                while (nx5.r(nx5Var.q())) {
                }
                nx5Var.L0.e(f48.ON_STOP);
                return new Bundle();
            case 3:
                return ((zx5) obj).U();
            default:
                a82 a82Var = (a82) obj;
                for (Map.Entry entry2 : bm8.X((LinkedHashMap) a82Var.e).entrySet()) {
                    a82Var.O(((s0e) ((h89) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : bm8.X((LinkedHashMap) a82Var.d).entrySet()) {
                    a82Var.O(((idc) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) a82Var.c;
                if (linkedHashMap2.isEmpty()) {
                    iy9VarArr = new iy9[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
                        arrayList.add(new iy9((String) entry4.getKey(), entry4.getValue()));
                    }
                    iy9VarArr = (iy9[]) arrayList.toArray(new iy9[0]);
                }
                return feg.r((iy9[]) Arrays.copyOf(iy9VarArr, iy9VarArr.length));
        }
    }
}
