package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qge extends h36 implements l26 {
    public static final qge a = new qge(2, xge.class, "decodeTarotBoxFaceBitmaps", "decodeTarotBoxFaceBitmaps(Landroid/content/Context;Lai/askquin/model/TarotSkinIdentify;)Ljava/util/List;", 1);

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Context context = (Context) obj;
        TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj2;
        context.getClass();
        tarotSkinIdentify.getClass();
        wge wgeVar = xge.a;
        mx4 mx4Var = yfe.d;
        ArrayList<Bitmap> arrayList = new ArrayList(mx4Var.c());
        try {
            Iterator it = mx4Var.iterator();
            while (it.hasNext()) {
                arrayList.add(xge.d(context, tarotSkinIdentify, (yfe) it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            for (Bitmap bitmap : arrayList) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            throw th;
        }
    }
}
