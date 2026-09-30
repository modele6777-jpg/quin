package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pvc {
    public static final wuc a = gec.e;

    public static final boolean a(hia hiaVar) {
        MotionEvent motionEventA;
        List list = hiaVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((oia) list.get(i)).i != 2) {
                MotionEvent motionEventA2 = hiaVar.a();
                if ((motionEventA2 == null || !motionEventA2.isFromSource(8194)) && ((motionEventA = hiaVar.a()) == null || !motionEventA.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
