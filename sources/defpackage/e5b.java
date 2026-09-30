package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e5b implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ e5b(Context context, String str) {
        this.a = 5;
        this.c = str;
        this.b = context;
    }

    @Override // defpackage.x16
    public final Object invoke() throws IOException {
        int i = this.a;
        wef wefVar = wef.a;
        Context context = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                Toast.makeText(context, str, 0).show();
                return wefVar;
            case 1:
                InputStream inputStreamOpen = context.getAssets().open(str);
                inputStreamOpen.getClass();
                return inputStreamOpen;
            case 2:
                InputStream inputStreamOpen2 = context.getAssets().open("tarot-card/rider_waite/" + str + ".webp");
                inputStreamOpen2.getClass();
                return inputStreamOpen2;
            case 3:
                Toast.makeText(context, str, 0).show();
                return wefVar;
            case 4:
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            default:
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new z53("app_update_now", str, 5), 2);
                kn2.T(context);
                return wefVar;
        }
    }

    public /* synthetic */ e5b(int i, Context context, String str) {
        this.a = i;
        this.b = context;
        this.c = str;
    }
}
