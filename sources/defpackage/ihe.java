package defpackage;

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
import com.google.android.filament.RenderTarget;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.TransformManager;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ihe {
    public final cge a;
    public final Context b;
    public final Object c = new Object();
    public final Handler d = new Handler(Looper.getMainLooper());
    public hhe e;
    public boolean f;
    public volatile boolean g;

    public ihe(Context context, cge cgeVar) {
        this.a = cgeVar;
        this.b = context.getApplicationContext();
    }

    public final hhe a(Engine engine) {
        cge cgeVar = this.a;
        int i = cgeVar.e;
        int i2 = cgeVar.d;
        Context context = this.b;
        context.getClass();
        Material materialQ = w6c.q(context, engine);
        TransformManager transformManager = engine.b;
        if (materialQ == null) {
            qc0.p("Tarot box material asset missing");
            return null;
        }
        lqb lqbVarB = q6c.b(engine);
        TextureSampler textureSampler = new TextureSampler();
        Renderer rendererE = engine.e();
        pk1 pk1Var = new pk1(5);
        pk1Var.b = true;
        pk1Var.c = new double[]{0.0d, 0.0d, 0.0d, 0.0d};
        rendererE.f(pk1Var);
        Scene sceneF = engine.f();
        int iA = ex4.a.a();
        double radians = Math.toRadians(3.81d);
        Camera cameraD = engine.d(iA);
        cameraD.b(Math.sin(radians) * (-2.85d), Math.cos(radians) * 2.85d);
        cameraD.d(((double) i2) / ((double) i));
        cameraD.c();
        long jNCreateBuilder = Texture.nCreateBuilder();
        new d82(jNCreateBuilder, 9);
        Texture.nBuilderWidth(jNCreateBuilder, i2);
        Texture.nBuilderHeight(jNCreateBuilder, i);
        Texture.nBuilderLevels(jNCreateBuilder, 1);
        Texture.nBuilderFormat(jNCreateBuilder, 30);
        Texture.nBuilderUsage(jNCreateBuilder, 65);
        lqb lqbVar = lqbVarB;
        long jNBuilderBuild = Texture.nBuilderBuild(jNCreateBuilder, engine.getNativeObject());
        if (jNBuilderBuild == 0) {
            qc0.p("Couldn't create Texture");
            return null;
        }
        Texture texture = new Texture();
        texture.a = jNBuilderBuild;
        long jNCreateBuilder2 = Texture.nCreateBuilder();
        new d82(jNCreateBuilder2, 9);
        Texture.nBuilderWidth(jNCreateBuilder2, i2);
        Texture.nBuilderHeight(jNCreateBuilder2, i);
        Texture.nBuilderLevels(jNCreateBuilder2, 1);
        Texture.nBuilderFormat(jNCreateBuilder2, 37);
        Texture.nBuilderUsage(jNCreateBuilder2, 2);
        long jNBuilderBuild2 = Texture.nBuilderBuild(jNCreateBuilder2, engine.getNativeObject());
        if (jNBuilderBuild2 == 0) {
            qc0.p("Couldn't create Texture");
            return null;
        }
        Texture texture2 = new Texture();
        texture2.a = jNBuilderBuild2;
        Texture[] textureArr = new Texture[RenderTarget.b];
        long jNCreateBuilder3 = RenderTarget.nCreateBuilder();
        new d82(jNCreateBuilder3, 7);
        textureArr[kv2.B(1)] = texture;
        RenderTarget.nBuilderTexture(jNCreateBuilder3, kv2.B(1), texture.getNativeObject());
        textureArr[kv2.B(9)] = texture2;
        RenderTarget.nBuilderTexture(jNCreateBuilder3, kv2.B(9), texture2.getNativeObject());
        long jNBuilderBuild3 = RenderTarget.nBuilderBuild(jNCreateBuilder3, engine.getNativeObject());
        if (jNBuilderBuild3 == 0) {
            qc0.p("Couldn't create RenderTarget");
            return null;
        }
        RenderTarget renderTarget = new RenderTarget();
        int i3 = RenderTarget.b;
        renderTarget.a = jNBuilderBuild3;
        System.arraycopy(textureArr, 0, new Texture[i3], 0, i3);
        long jNCreateBuilder4 = ColorGrading.nCreateBuilder();
        new d82(jNCreateBuilder4, 0);
        long j = new mze().a;
        if (j == 0) {
            qc0.p("Calling method on destroyed ToneMapper");
            return null;
        }
        ColorGrading.nBuilderToneMapper(jNCreateBuilder4, j);
        ColorGrading.nBuilderContrast(jNCreateBuilder4, 1.0f);
        ColorGrading.nBuilderSaturation(jNCreateBuilder4, 1.0f);
        long jNBuilderBuild4 = ColorGrading.nBuilderBuild(jNCreateBuilder4, engine.getNativeObject());
        if (jNBuilderBuild4 == 0) {
            qc0.p("Couldn't create ColorGrading");
            return null;
        }
        ColorGrading colorGrading = new ColorGrading();
        colorGrading.a = jNBuilderBuild4;
        View viewI = engine.i();
        viewI.g(sceneF);
        viewI.c(cameraD);
        viewI.d(colorGrading);
        viewI.b();
        viewI.f(renderTarget);
        viewI.h(new h71(i2, i, 9));
        f17 f17Var = new f17(5);
        f17Var.b = true;
        viewI.e(f17Var);
        SwapChain swapChainG = engine.g(i2, i);
        List list = lhe.c;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axe axeVar = (axe) it.next();
            Iterator it2 = it;
            int iA2 = ex4.a.a();
            RenderTarget renderTarget2 = renderTarget;
            SwapChain swapChain = swapChainG;
            long jNCreateBuilder5 = LightManager.nCreateBuilder(kv2.B(2));
            Camera camera = cameraD;
            View view = viewI;
            new d82(jNCreateBuilder5, 4);
            float[] fArr = axeVar.a;
            ColorGrading colorGrading2 = colorGrading;
            LightManager.nBuilderColor(jNCreateBuilder5, fArr[0], fArr[1], fArr[2]);
            LightManager.nBuilderIntensity(jNCreateBuilder5, axeVar.b);
            float[] fArr2 = axeVar.c;
            LightManager.nBuilderDirection(jNCreateBuilder5, fArr2[0], fArr2[1], fArr2[2]);
            LightManager.nBuilderCastShadows(jNCreateBuilder5, false);
            if (!LightManager.nBuilderBuild(jNCreateBuilder5, engine.getNativeObject(), iA2)) {
                qc0.p(tec.f(iA2, "Couldn't create Light component for entity ", ", see log."));
                return null;
            }
            sceneF.a(iA2);
            arrayList.add(Integer.valueOf(iA2));
            cameraD = camera;
            it = it2;
            renderTarget = renderTarget2;
            swapChainG = swapChain;
            viewI = view;
            colorGrading = colorGrading2;
        }
        Camera camera2 = cameraD;
        View view2 = viewI;
        ColorGrading colorGrading3 = colorGrading;
        RenderTarget renderTarget3 = renderTarget;
        SwapChain swapChain2 = swapChainG;
        Texture textureF = xge.f(engine, -14015437);
        Texture textureC = xge.c(context, engine);
        Texture textureF2 = xge.f(engine, Integer.MIN_VALUE);
        mx4<yfe> mx4Var = yfe.d;
        ArrayList arrayList2 = new ArrayList(t72.u(mx4Var, 10));
        for (yfe yfeVar : mx4Var) {
            Texture texture3 = textureC;
            MaterialInstance materialInstanceB = materialQ.b();
            materialInstanceB.b("dimFactor", 1.0f);
            materialInstanceB.c("baseColorMap", textureF, textureSampler);
            materialInstanceB.c("overlayMap", yfeVar == yfe.FRONT ? texture3 : textureF2, textureSampler);
            materialInstanceB.b("overlayAmount", 0.0f);
            arrayList2.add(materialInstanceB);
            textureC = texture3;
        }
        Texture texture4 = textureC;
        int iA3 = ex4.a.a();
        long jNCreateBuilder6 = RenderableManager.nCreateBuilder(mx4Var.c());
        new d82(jNCreateBuilder6, 8);
        k47 k47Var = new k47(14);
        float[] fArr3 = (float[]) k47Var.b;
        float f = fArr3[0];
        float f2 = fArr3[1];
        float f3 = fArr3[2];
        float[] fArr4 = (float[]) k47Var.c;
        RenderableManager.nBuilderBoundingBox(jNCreateBuilder6, f, f2, f3, fArr4[0], fArr4[1], fArr4[2]);
        RenderableManager.nBuilderCulling(jNCreateBuilder6, false);
        Iterator it3 = mx4Var.iterator();
        while (it3.hasNext()) {
            yfe yfeVar2 = (yfe) it3.next();
            int iOrdinal = yfeVar2.ordinal();
            lqb lqbVar2 = lqbVar;
            Iterator it4 = it3;
            VertexBuffer vertexBuffer = (VertexBuffer) lqbVar2.b;
            IndexBuffer indexBuffer = (IndexBuffer) lqbVar2.c;
            ace aceVar = zfe.a;
            RenderableManager.nBuilderGeometry(jNCreateBuilder6, iOrdinal, erb.TRIANGLES.a(), vertexBuffer.g(), indexBuffer.f(), ((v21) aceVar.getValue()).c[yfeVar2.ordinal()], ((v21) aceVar.getValue()).d[yfeVar2.ordinal()]);
            RenderableManager.nBuilderMaterial(jNCreateBuilder6, yfeVar2.ordinal(), ((MaterialInstance) arrayList2.get(yfeVar2.ordinal())).a());
            it3 = it4;
            textureSampler = textureSampler;
            textureF2 = textureF2;
            lqbVar = lqbVar2;
        }
        Texture texture5 = textureF2;
        TextureSampler textureSampler2 = textureSampler;
        lqb lqbVar3 = lqbVar;
        if (!RenderableManager.nBuilderBuild(jNCreateBuilder6, engine.getNativeObject(), iA3)) {
            qc0.p(tec.f(iA3, "Couldn't create Renderable component for entity ", ", see log."));
            return null;
        }
        transformManager.a(iA3);
        sceneF.a(iA3);
        int iC = transformManager.c(iA3);
        l7c l7cVar = new l7c(arrayList2, iA3, iC);
        double radians2 = Math.toRadians(cgeVar.b);
        double radians3 = Math.toRadians(cgeVar.a);
        double radians4 = Math.toRadians(cgeVar.c);
        float fCos = (float) Math.cos(radians2);
        float fSin = (float) Math.sin(radians2);
        float fCos2 = (float) Math.cos(radians3);
        float fSin2 = (float) Math.sin(radians3);
        float fCos3 = (float) Math.cos(radians4);
        float fSin3 = (float) Math.sin(radians4);
        float f4 = cgeVar.f;
        float f5 = fCos3 * fSin2;
        float f6 = fSin2 * fSin3;
        transformManager.d(iC, new float[]{fCos3 * fCos2 * f4, fSin3 * fCos2 * f4, (-fSin2) * f4, 0.0f, ((f5 * fSin) - (fSin3 * fCos)) * f4, ((fCos3 * fCos) + (f6 * fSin)) * f4, fCos2 * fSin * f4, 0.0f, ((fSin3 * fSin) + (f5 * fCos)) * f4, ((f6 * fCos) - (fCos3 * fSin)) * f4, fCos2 * fCos * f4, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i2 * i * 4).order(ByteOrder.nativeOrder());
        byteBufferOrder.getClass();
        return new hhe(engine, rendererE, sceneF, view2, colorGrading3, camera2, iA, materialQ, lqbVar3, renderTarget3, texture, texture2, swapChain2, textureF, texture4, texture5, arrayList, l7cVar, textureSampler2, byteBufferOrder);
    }

    public final boolean b(hhe hheVar) {
        Renderer renderer = hheVar.b;
        ByteBuffer byteBuffer = hheVar.s;
        char c = 0;
        if (!renderer.a(hheVar.l, System.nanoTime())) {
            hf8.Q.getClass();
            ef8.a("TarotBox3D").g("Thumbnail beginFrame declined");
            return false;
        }
        renderer.e(hheVar.d);
        byteBuffer.clear();
        ni niVar = new ni(11);
        psd psdVar = new psd(6, c);
        psdVar.b = byteBuffer;
        psdVar.c = this.d;
        psdVar.d = niVar;
        Renderer renderer2 = hheVar.b;
        RenderTarget renderTarget = hheVar.i;
        cge cgeVar = this.a;
        renderer2.d(renderTarget, cgeVar.d, cgeVar.e, psdVar);
        renderer.b();
        hheVar.a.w();
        return true;
    }
}
