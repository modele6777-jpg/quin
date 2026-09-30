package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xge {
    public static final wge a = new wge();
    public static final HashMap b = new HashMap();

    public static final Texture a(Engine engine, Bitmap bitmap) {
        int iMax = Math.max(bitmap.getWidth(), bitmap.getHeight());
        int i = 1;
        while (iMax > 1) {
            iMax >>= 1;
            i++;
        }
        long jNCreateBuilder = Texture.nCreateBuilder();
        new d82(jNCreateBuilder, 9);
        Texture.nBuilderWidth(jNCreateBuilder, bitmap.getWidth());
        Texture.nBuilderHeight(jNCreateBuilder, bitmap.getHeight());
        Texture.nBuilderLevels(jNCreateBuilder, i);
        Texture.nBuilderSampler(jNCreateBuilder, 0);
        Texture.nBuilderFormat(jNCreateBuilder, 31);
        Texture.nBuilderUsage(jNCreateBuilder, i > 1 ? 536 : 24);
        long jNBuilderBuild = Texture.nBuilderBuild(jNCreateBuilder, engine.getNativeObject());
        if (jNBuilderBuild == 0) {
            qc0.p("Couldn't create Texture");
            return null;
        }
        Texture texture = new Texture();
        texture.a = jNBuilderBuild;
        try {
            TextureHelper.a(engine, texture, bitmap);
            if (i <= 1) {
                return texture;
            }
            texture.j(engine);
            return texture;
        } catch (Throwable th) {
            try {
                engine.t(texture);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public static final ArrayList b(Engine engine, List list) {
        list.getClass();
        int i = 0;
        Class<Engine> cls = Engine.class;
        vx7 vx7Var = new vx7(1, engine, cls, "destroyTexture", "destroyTexture(Lcom/google/android/filament/Texture;)V", i, 26);
        yv9 yv9Var = new yv9(0, engine, cls, "flushAndWait", "flushAndWait()V", i, 21);
        ArrayList arrayList = new ArrayList(list.size());
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = (Bitmap) it.next();
                arrayList.add(bitmap != null ? a(engine, bitmap) : f(engine, -14015437));
            }
            return arrayList;
        } catch (Throwable th) {
            Iterator it2 = new n0c(arrayList).iterator();
            while (true) {
                ListIterator listIterator = (ListIterator) ((m0c) it2).b;
                if (!listIterator.hasPrevious()) {
                    yv9Var.invoke();
                    throw th;
                }
                vx7Var.d(listIterator.previous());
            }
        }
    }

    public static final Texture c(Context context, Engine engine) {
        context.getClass();
        int identifier = context.getResources().getIdentifier("tarot_box_lock_mask", "drawable", context.getPackageName());
        Bitmap bitmapDecodeResource = identifier != 0 ? BitmapFactory.decodeResource(context.getResources(), identifier) : null;
        if (bitmapDecodeResource == null) {
            return f(engine, Integer.MIN_VALUE);
        }
        try {
            return a(engine, bitmapDecodeResource);
        } finally {
            bitmapDecodeResource.recycle();
        }
    }

    public static final Bitmap d(Context context, TarotSkinIdentify tarotSkinIdentify, yfe yfeVar) {
        tarotSkinIdentify.getClass();
        yfeVar.getClass();
        if (tarotSkinIdentify == TarotSkinIdentify.NeoRiderWaite) {
            tarotSkinIdentify = TarotSkinIdentify.Classic;
        }
        String strK = ub3.k("tarot_box_", tarotSkinIdentify.getFolder(), "_", yfeVar.a());
        int identifier = context.getResources().getIdentifier(strK, "drawable", context.getPackageName());
        if (identifier != 0) {
            return BitmapFactory.decodeResource(context.getResources(), identifier);
        }
        hf8.Q.getClass();
        ef8.a("TarotBox3D").g("Box face texture missing: " + strK + ", using solid fill");
        return null;
    }

    public static final int e(Context context, TarotSkinIdentify tarotSkinIdentify) {
        Integer num;
        int iIntValue;
        context.getClass();
        tarotSkinIdentify.getClass();
        HashMap map = b;
        synchronized (map) {
            num = (Integer) map.get(tarotSkinIdentify);
        }
        if (num != null) {
            return num.intValue();
        }
        Bitmap bitmapD = d(context, tarotSkinIdentify, yfe.BACK);
        try {
            int iA = lhe.a(bitmapD);
            if (bitmapD != null) {
                bitmapD.recycle();
            }
            synchronized (map) {
                try {
                    Object objValueOf = map.get(tarotSkinIdentify);
                    if (objValueOf == null) {
                        objValueOf = Integer.valueOf(iA);
                        map.put(tarotSkinIdentify, objValueOf);
                    }
                    iIntValue = ((Number) objValueOf).intValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        } catch (Throwable th2) {
            if (bitmapD != null) {
                bitmapD.recycle();
            }
            throw th2;
        }
    }

    public static final Texture f(Engine engine, int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        bitmapCreateBitmap.eraseColor(i);
        try {
            return a(engine, bitmapCreateBitmap);
        } finally {
            bitmapCreateBitmap.recycle();
        }
    }
}
