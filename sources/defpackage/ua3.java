package defpackage;

import ai.askquin.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ua3 {
    public static final List a = t72.I(new xa3(1, R.string.daily_push_01_title, R.string.daily_push_01_body), new xa3(2, R.string.daily_push_02_title, R.string.daily_push_02_body), new xa3(3, R.string.daily_push_03_title, R.string.daily_push_03_body), new xa3(4, R.string.daily_push_04_title, R.string.daily_push_04_body), new xa3(5, R.string.daily_push_05_title, R.string.daily_push_05_body), new xa3(6, R.string.daily_push_06_title, R.string.daily_push_06_body), new xa3(7, R.string.daily_push_07_title, R.string.daily_push_07_body), new xa3(8, R.string.daily_push_08_title, R.string.daily_push_08_body), new xa3(9, R.string.daily_push_09_title, R.string.daily_push_09_body), new xa3(10, R.string.daily_push_10_title, R.string.daily_push_10_body), new xa3(11, R.string.daily_push_11_title, R.string.daily_push_11_body), new xa3(12, R.string.daily_push_12_title, R.string.daily_push_12_body), new xa3(13, R.string.daily_push_13_title, R.string.daily_push_13_body));
    public static final List b = t72.I(new xa3("tomorrow_push", 1, R.string.tomorrow_push_01_title, R.string.tomorrow_push_01_body), new xa3("tomorrow_push", 2, R.string.tomorrow_push_02_title, R.string.tomorrow_push_02_body), new xa3("tomorrow_push", 3, R.string.tomorrow_push_03_title, R.string.tomorrow_push_03_body), new xa3("tomorrow_push", 4, R.string.tomorrow_push_04_title, R.string.tomorrow_push_04_body), new xa3("tomorrow_push", 5, R.string.tomorrow_push_05_title, R.string.tomorrow_push_05_body), new xa3("tomorrow_push", 6, R.string.tomorrow_push_06_title, R.string.tomorrow_push_06_body), new xa3("tomorrow_push", 7, R.string.tomorrow_push_07_title, R.string.tomorrow_push_07_body), new xa3("tomorrow_push", 8, R.string.tomorrow_push_08_title, R.string.tomorrow_push_08_body), new xa3("tomorrow_push", 9, R.string.tomorrow_push_09_title, R.string.tomorrow_push_09_body), new xa3("tomorrow_push", 10, R.string.tomorrow_push_10_title, R.string.tomorrow_push_10_body), new xa3("tomorrow_push", 11, R.string.tomorrow_push_11_title, R.string.tomorrow_push_11_body), new xa3("tomorrow_push", 12, R.string.tomorrow_push_12_title, R.string.tomorrow_push_12_body), new xa3("tomorrow_push", 13, R.string.tomorrow_push_13_title, R.string.tomorrow_push_13_body));

    public static final ArrayList a() {
        List<xa3> list = a;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (xa3 xa3Var : list) {
            int i = xa3Var.a;
            String str = xa3Var.d;
            str.getClass();
            arrayList.add(new x04(String.format(Locale.ROOT, "%s_%02d", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2)), i, xa3Var.b, xa3Var.c));
        }
        return arrayList;
    }
}
