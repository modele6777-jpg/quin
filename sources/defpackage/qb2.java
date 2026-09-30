package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb2 implements zm9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb2 b;

    public /* synthetic */ qb2(vb2 vb2Var, int i) {
        this.a = i;
        this.b = vb2Var;
    }

    @Override // defpackage.zm9
    public final void a(vb2 vb2Var) {
        int i = this.a;
        vb2 vb2Var2 = this.b;
        switch (i) {
            case 0:
                vb2Var.getClass();
                Bundle bundleO = ((vea) vb2Var2.d.c).o("android:support:activity-result");
                if (bundleO != null) {
                    tb2 tb2Var = vb2Var2.w;
                    LinkedHashMap linkedHashMap = tb2Var.b;
                    LinkedHashMap linkedHashMap2 = tb2Var.a;
                    Bundle bundle = tb2Var.g;
                    ArrayList<Integer> integerArrayList = bundleO.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleO.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleO.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            tb2Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleO.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    z7f.q(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            tb2Var.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                mx5 mx5Var = (mx5) ((nx5) vb2Var2).K0.b;
                mx5Var.J0.b(mx5Var, mx5Var, null);
                break;
        }
    }
}
