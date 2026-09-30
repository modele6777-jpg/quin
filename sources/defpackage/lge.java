package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.filament.Camera;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.LightManager;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lge {
    public final Context a;
    public final Engine b;
    public final Renderer c;
    public final Scene d;
    public final View e;
    public final Camera f;
    public final int g;
    public final Material h;
    public final lqb i;
    public final ColorGrading j;
    public ege k;
    public final TextureSampler l;
    public final ArrayList m;
    public SwapChain n;
    public int o;
    public int p;
    public final ArrayList q;
    public final LinkedHashMap r;
    public final Texture s;
    public final Texture t;
    public final Texture u;
    public boolean v;
    public final Handler w;
    public long x;
    public boolean y;
    public final m45 z;

    public lge(Context context, Engine engine, Renderer renderer, Scene scene, View view, Camera camera, int i, Material material, lqb lqbVar, ColorGrading colorGrading) {
        this.a = context;
        this.b = engine;
        this.c = renderer;
        this.d = scene;
        this.e = view;
        this.f = camera;
        this.g = i;
        this.h = material;
        this.i = lqbVar;
        this.j = colorGrading;
        wge wgeVar = xge.a;
        wgeVar.getClass();
        this.k = new ege(new vea(wgeVar, jgb.k(i7h.I(iqf.d(), wgeVar.b)), false, 15), new LinkedHashSet(), new LinkedHashMap());
        this.l = new TextureSampler();
        this.m = new ArrayList();
        this.q = new ArrayList();
        this.r = new LinkedHashMap(16, 0.75f, true);
        this.s = xge.f(engine, -14015437);
        this.t = xge.c(context, engine);
        this.u = xge.f(engine, Integer.MIN_VALUE);
        this.w = new Handler(Looper.getMainLooper());
        this.x = 1000L;
        this.z = new m45(25, this);
        for (bge bgeVar : mge.a) {
            int iA = ex4.a.a();
            long jNCreateBuilder = LightManager.nCreateBuilder(1);
            new d82(jNCreateBuilder, 4);
            float[] fArr = bgeVar.a;
            LightManager.nBuilderColor(jNCreateBuilder, fArr[0], fArr[1], fArr[2]);
            LightManager.nBuilderIntensity(jNCreateBuilder, bgeVar.b);
            float[] fArr2 = bgeVar.c;
            LightManager.nBuilderDirection(jNCreateBuilder, fArr2[0], fArr2[1], fArr2[2]);
            LightManager.nBuilderCastShadows(jNCreateBuilder, false);
            if (!LightManager.nBuilderBuild(jNCreateBuilder, this.b.getNativeObject(), iA)) {
                qc0.p(tec.f(iA, "Couldn't create Light component for entity ", ", see log."));
                throw null;
            }
            this.d.a(iA);
            this.q.add(Integer.valueOf(iA));
        }
    }

    public final void a(dge dgeVar, List list) {
        mx4 mx4Var = yfe.d;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            yfe yfeVar = (yfe) l2Var.next();
            ((MaterialInstance) dgeVar.c.get(yfeVar.ordinal())).c("baseColorMap", (Texture) list.get(yfeVar.ordinal()), this.l);
        }
    }

    public final void b() {
        this.w.removeCallbacks(this.z);
        this.y = false;
        this.x = 1000L;
    }

    public final void c() {
        ArrayList<dge> arrayList = this.m;
        for (dge dgeVar : arrayList) {
            this.d.c(dgeVar.a);
            Engine engine = this.b;
            RenderableManager renderableManager = engine.d;
            int i = dgeVar.a;
            renderableManager.h(i);
            engine.b.b(i);
            ex4.a.b(i);
            Iterator it = dgeVar.c.iterator();
            while (it.hasNext()) {
                engine.o((MaterialInstance) it.next());
            }
        }
        arrayList.clear();
    }

    public final void d() {
        if (this.v) {
            return;
        }
        this.v = true;
        b();
        jgb.I((qn2) this.k.a.b, null);
        SwapChain swapChain = this.n;
        Engine engine = this.b;
        if (swapChain != null) {
            engine.s(swapChain);
            engine.w();
        }
        this.n = null;
        c();
        LinkedHashMap linkedHashMap = this.r;
        Collection<List> collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        for (List list : collectionValues) {
            list.getClass();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                engine.t((Texture) it.next());
            }
        }
        linkedHashMap.clear();
        engine.t(this.s);
        engine.t(this.t);
        engine.t(this.u);
        ArrayList arrayList = this.q;
        Iterator it2 = arrayList.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            Scene scene = this.d;
            if (!zHasNext) {
                arrayList.clear();
                lqb lqbVar = this.i;
                engine.u((VertexBuffer) lqbVar.b);
                engine.m((IndexBuffer) lqbVar.c);
                engine.n(this.h);
                engine.q(this.c);
                engine.v(this.e);
                engine.l(this.j);
                engine.r(scene);
                int i = this.g;
                engine.k(i);
                ex4.a.b(i);
                engine.w();
                engine.j();
                return;
            }
            int iIntValue = ((Number) it2.next()).intValue();
            scene.c(iIntValue);
            engine.c.h(iIntValue);
            ex4.a.b(iIntValue);
        }
    }

    public final void e(c78 c78Var) {
        ListIterator listIterator = c78Var.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return;
            }
            List list = (List) this.r.remove((TarotSkinIdentify) ql6Var.next());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.b.t((Texture) it.next());
                }
            }
        }
    }

    public final void f(TarotSkinIdentify tarotSkinIdentify) {
        Context context = this.a;
        if (m7c.l(context)) {
            fhe fheVar = fhe.a;
            fhe.b.e(true);
            HashSet hashSet = new HashSet();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                age ageVar = ((dge) it.next()).d;
                TarotSkinIdentify tarotSkinIdentify2 = ageVar != null ? ageVar.a : null;
                if (tarotSkinIdentify2 != null) {
                    hashSet.add(tarotSkinIdentify2);
                }
            }
            if (i(0, hashSet)) {
                this.b.w();
            }
            h();
            return;
        }
        ege egeVar = this.k;
        if (egeVar.b.contains(tarotSkinIdentify) || this.r.containsKey(tarotSkinIdentify)) {
            return;
        }
        Integer num = (Integer) egeVar.c.get(tarotSkinIdentify);
        int iIntValue = num != null ? num.intValue() : 0;
        List list = mge.a;
        if (iIntValue < 3) {
            egeVar.b.add(tarotSkinIdentify);
            vea veaVar = egeVar.a;
            gge ggeVar = new gge(null, egeVar, this, tarotSkinIdentify);
            ige igeVar = new ige(null, egeVar, this, tarotSkinIdentify);
            kge kgeVar = new kge(egeVar, tarotSkinIdentify, null);
            tarotSkinIdentify.getClass();
            ynb.V((qn2) veaVar.b, null, null, new tge((wge) veaVar.c, context, tarotSkinIdentify, ggeVar, igeVar, kgeVar, null), 3);
        }
    }

    public final void g() {
        if (this.v) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            age ageVar = ((dge) it.next()).d;
            TarotSkinIdentify tarotSkinIdentify = ageVar != null ? ageVar.a : null;
            if (tarotSkinIdentify != null) {
                hashSet.add(tarotSkinIdentify);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : hashSet) {
            TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj;
            if (!this.r.containsKey(tarotSkinIdentify2)) {
                Integer num = (Integer) this.k.c.get(tarotSkinIdentify2);
                int iIntValue = num != null ? num.intValue() : 0;
                List list = mge.a;
                if (iIntValue < 3) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.x = 1000L;
        } else {
            if (m7c.l(this.a)) {
                h();
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f((TarotSkinIdentify) it2.next());
            }
        }
    }

    public final void h() {
        if (this.v || this.y) {
            return;
        }
        this.y = true;
        this.w.postDelayed(this.z, this.x);
        long j = this.x * 2;
        if (j > 8000) {
            j = 8000;
        }
        this.x = j;
    }

    public final boolean i(int i, Set set) {
        Set setKeySet = this.r.keySet();
        setKeySet.getClass();
        c78 c78VarA = mge.a(s72.j1(setKeySet), set, i);
        e(c78VarA);
        return !c78VarA.isEmpty();
    }
}
