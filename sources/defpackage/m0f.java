package defpackage;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0f {
    public static WeakReference b;
    public gg7 a;

    public final synchronized l0f a() {
        String str;
        l0f l0fVar;
        gg7 gg7Var = this.a;
        synchronized (((ArrayDeque) gg7Var.c)) {
            str = (String) ((ArrayDeque) gg7Var.c).peek();
        }
        Pattern pattern = l0f.d;
        l0fVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                l0fVar = new l0f(strArrSplit[0], strArrSplit[1]);
            }
        }
        return l0fVar;
    }
}
