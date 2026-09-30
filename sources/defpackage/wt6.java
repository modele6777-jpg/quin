package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface wt6 {
    static Boolean a(Context context, String str, String str2, String str3) {
        Object dzbVar;
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        intent.putExtra("android.intent.extra.TEXT", str3 + "\n" + str);
        Intent intentCreateChooser = Intent.createChooser(intent, context.getString(R.string.share_activity_title));
        intentCreateChooser.setFlags(268435456);
        try {
            context.startActivity(intentCreateChooser);
            dzbVar = wef.a;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return Boolean.valueOf(!(dzbVar instanceof dzb));
    }

    static Object b(wt6 wt6Var, Context context, Bitmap bitmap, String str, zn2 zn2Var, int i) {
        if ((i & 16) != 0) {
            str = null;
        }
        wt6Var.getClass();
        js3 js3Var = ga4.a;
        return ynb.p0(hr3.c, new rz0(null, context, bitmap, str), zn2Var);
    }
}
