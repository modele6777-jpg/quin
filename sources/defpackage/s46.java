package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s46 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = pqf.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    public final void b(su8 su8Var) {
        qu8 qu8Var;
        su8Var.getClass();
        dy6 dy6VarM = jy6.m();
        qu8[] qu8VarArr = su8Var.a;
        int length = qu8VarArr.length;
        int i = 0;
        while (true) {
            qu8 qu8Var2 = null;
            if (i >= length) {
                break;
            }
            qu8 qu8Var3 = qu8VarArr[i];
            if (aa2.class.isAssignableFrom(qu8Var3.getClass())) {
                qu8 qu8Var4 = (qu8) aa2.class.cast(qu8Var3);
                if (((aa2) qu8Var4).c.equals("iTunSMPB")) {
                    qu8Var2 = qu8Var4;
                }
            }
            if (qu8Var2 != null) {
                dy6VarM.b(qu8Var2);
            }
            i++;
        }
        ey6 ey6VarListIterator = dy6VarM.g().listIterator(0);
        while (ey6VarListIterator.hasNext()) {
            if (a(((aa2) ey6VarListIterator.next()).d)) {
                return;
            }
        }
        ar3 ar3Var = new ar3(2);
        dy6 dy6VarM2 = jy6.m();
        for (qu8 qu8Var5 : su8Var.a) {
            if (x87.class.isAssignableFrom(qu8Var5.getClass())) {
                qu8Var = (qu8) x87.class.cast(qu8Var5);
                if (!ar3Var.apply(qu8Var)) {
                    qu8Var = null;
                }
            } else {
                qu8Var = null;
            }
            if (qu8Var != null) {
                dy6VarM2.b(qu8Var);
            }
        }
        ey6 ey6VarListIterator2 = dy6VarM2.g().listIterator(0);
        while (ey6VarListIterator2.hasNext() && !a(((x87) ey6VarListIterator2.next()).d)) {
        }
    }
}
