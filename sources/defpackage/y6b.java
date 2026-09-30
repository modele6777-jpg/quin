package defpackage;

import ai.askquin.data.quickdecision.QuickDecisionCard;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y6b {
    public static final eu4 b = new eu4(21);
    public static String c;
    public static List d;
    public final Context a;

    public y6b(Context context) {
        context.getClass();
        this.a = context;
    }

    public final QuickDecisionCard a(String str) {
        Object next;
        str.getClass();
        Iterator it = b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (pa7.t(((QuickDecisionCard) next).getCardKey(), str)) {
                return (QuickDecisionCard) next;
            }
        }
        next = null;
        return (QuickDecisionCard) next;
    }

    public final List b() {
        eu4 eu4Var = b;
        Context context = this.a;
        synchronized (eu4Var) {
            String strJ = eu4.j();
            if (d != null && pa7.t(c, strJ)) {
                List list = d;
                list.getClass();
                return list;
            }
            InputStream inputStreamOpen = context.getAssets().open("quick-decision/" + strJ + ".json");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                try {
                    String strL = o5c.l(bufferedReader);
                    bufferedReader.close();
                    ym8.t(inputStreamOpen, null);
                    xh7 xh7Var = fzc.a;
                    xh7Var.getClass();
                    List list2 = (List) xh7Var.b(new dd0(QuickDecisionCard.Companion.serializer(), 0), strL);
                    c = strJ;
                    d = list2;
                    return list2;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    ym8.t(inputStreamOpen, th3);
                    throw th4;
                }
            }
        }
    }
}
