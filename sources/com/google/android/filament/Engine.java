package com.google.android.filament;

import android.view.Surface;
import defpackage.d82;
import defpackage.h71;
import defpackage.kv2;
import defpackage.qc0;
import defpackage.uea;
import defpackage.yg5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class Engine {
    public long a;
    public final TransformManager b;
    public final LightManager c;
    public final RenderableManager d;

    static {
        kv2.C(6);
        kv2.C(4);
    }

    public Engine(long j) {
        this.a = j;
        long jNGetTransformManager = nGetTransformManager(j);
        TransformManager transformManager = new TransformManager();
        transformManager.a = jNGetTransformManager;
        this.b = transformManager;
        long jNGetLightManager = nGetLightManager(j);
        LightManager lightManager = new LightManager();
        lightManager.a = jNGetLightManager;
        this.c = lightManager;
        long jNGetRenderableManager = nGetRenderableManager(j);
        RenderableManager renderableManager = new RenderableManager();
        renderableManager.a = jNGetRenderableManager;
        this.d = renderableManager;
        new EntityManager(nGetEntityManager(j));
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        qc0.p("Object couldn't be destroyed (double destroy()?)");
    }

    public static Engine c() {
        long jNCreateBuilder = nCreateBuilder();
        new d82(jNCreateBuilder, 1);
        long jNBuilderBuild = nBuilderBuild(jNCreateBuilder);
        if (jNBuilderBuild != 0) {
            return new Engine(jNBuilderBuild);
        }
        qc0.p("Couldn't create Engine");
        return null;
    }

    private static native long nBuilderBuild(long j);

    private static native long nCreateBuilder();

    private static native long nCreateCamera(long j, int i);

    private static native long nCreateRenderer(long j);

    private static native long nCreateScene(long j);

    private static native long nCreateSwapChain(long j, Object obj, long j2);

    private static native long nCreateSwapChainHeadless(long j, int i, int i2, long j2);

    private static native long nCreateView(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native void nDestroyCameraComponent(long j, int i);

    private static native boolean nDestroyColorGrading(long j, long j2);

    private static native void nDestroyEngine(long j);

    private static native boolean nDestroyIndexBuffer(long j, long j2);

    private static native boolean nDestroyMaterial(long j, long j2);

    private static native boolean nDestroyMaterialInstance(long j, long j2);

    private static native boolean nDestroyRenderTarget(long j, long j2);

    private static native boolean nDestroyRenderer(long j, long j2);

    private static native boolean nDestroyScene(long j, long j2);

    private static native boolean nDestroySwapChain(long j, long j2);

    private static native boolean nDestroyTexture(long j, long j2);

    private static native boolean nDestroyVertexBuffer(long j, long j2);

    private static native boolean nDestroyView(long j, long j2);

    private static native boolean nFlushAndWait(long j, long j2);

    private static native long nGetEntityManager(long j);

    private static native long nGetJobSystem(long j);

    private static native long nGetLightManager(long j);

    private static native long nGetRenderableManager(long j);

    private static native long nGetTransformManager(long j);

    public final Camera d(int i) {
        long jNCreateCamera = nCreateCamera(getNativeObject(), i);
        if (jNCreateCamera == 0) {
            qc0.p("Couldn't create Camera");
            return null;
        }
        Camera camera = new Camera();
        camera.a = jNCreateCamera;
        return camera;
    }

    public final Renderer e() {
        long jNCreateRenderer = nCreateRenderer(getNativeObject());
        if (jNCreateRenderer != 0) {
            return new Renderer(this, jNCreateRenderer);
        }
        qc0.p("Couldn't create Renderer");
        return null;
    }

    public final Scene f() {
        long jNCreateScene = nCreateScene(getNativeObject());
        if (jNCreateScene == 0) {
            qc0.p("Couldn't create Scene");
            return null;
        }
        Scene scene = new Scene();
        scene.a = jNCreateScene;
        return scene;
    }

    public final SwapChain g(int i, int i2) {
        if (i < 0 || i2 < 0) {
            qc0.j("Invalid parameters");
            return null;
        }
        long jNCreateSwapChainHeadless = nCreateSwapChainHeadless(getNativeObject(), i, i2, 0L);
        if (jNCreateSwapChainHeadless != 0) {
            return new SwapChain(jNCreateSwapChainHeadless, null);
        }
        qc0.p("Couldn't create SwapChain");
        return null;
    }

    public long getNativeJobSystem() {
        if (this.a != 0) {
            return nGetJobSystem(getNativeObject());
        }
        qc0.p("Calling method on destroyed Engine");
        return 0L;
    }

    public long getNativeObject() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed Engine");
        return 0L;
    }

    public final SwapChain h(Surface surface) {
        if (!uea.a().b(surface)) {
            yg5.l(surface, "Invalid surface ");
            return null;
        }
        long jNCreateSwapChain = nCreateSwapChain(getNativeObject(), surface, 1L);
        if (jNCreateSwapChain != 0) {
            return new SwapChain(jNCreateSwapChain, surface);
        }
        qc0.p("Couldn't create SwapChain");
        return null;
    }

    public final View i() {
        long jNCreateView = nCreateView(getNativeObject());
        if (jNCreateView == 0) {
            qc0.p("Couldn't create View");
            return null;
        }
        View view = new View();
        int i = 0;
        view.b = new h71(i, i, 9);
        view.a = jNCreateView;
        return view;
    }

    public final void j() {
        nDestroyEngine(getNativeObject());
        this.a = 0L;
    }

    public final void k(int i) {
        nDestroyCameraComponent(getNativeObject(), i);
    }

    public final void l(ColorGrading colorGrading) {
        long nativeObject = getNativeObject();
        long j = colorGrading.a;
        if (j == 0) {
            qc0.p("Calling method on destroyed ColorGrading");
        } else {
            b(nDestroyColorGrading(nativeObject, j));
            colorGrading.a = 0L;
        }
    }

    public final void m(IndexBuffer indexBuffer) {
        b(nDestroyIndexBuffer(getNativeObject(), indexBuffer.f()));
        indexBuffer.a = 0L;
    }

    public final void n(Material material) {
        b(nDestroyMaterial(getNativeObject(), material.c()));
        material.a = 0L;
    }

    public final void o(MaterialInstance materialInstance) {
        b(nDestroyMaterialInstance(getNativeObject(), materialInstance.a()));
        materialInstance.a = 0L;
    }

    public final void p(RenderTarget renderTarget) {
        nDestroyRenderTarget(getNativeObject(), renderTarget.e());
        renderTarget.a = 0L;
    }

    public final void q(Renderer renderer) {
        b(nDestroyRenderer(getNativeObject(), renderer.c()));
        renderer.b = 0L;
    }

    public final void r(Scene scene) {
        b(nDestroyScene(getNativeObject(), scene.b()));
        scene.a = 0L;
    }

    public final void s(SwapChain swapChain) {
        long nativeObject = getNativeObject();
        long j = swapChain.b;
        if (j == 0) {
            qc0.p("Calling method on destroyed SwapChain");
        } else {
            b(nDestroySwapChain(nativeObject, j));
            swapChain.b = 0L;
        }
    }

    public final void t(Texture texture) {
        b(nDestroyTexture(getNativeObject(), texture.getNativeObject()));
        texture.a = 0L;
    }

    public final void u(VertexBuffer vertexBuffer) {
        b(nDestroyVertexBuffer(getNativeObject(), vertexBuffer.g()));
        vertexBuffer.a = 0L;
    }

    public final void v(View view) {
        b(nDestroyView(getNativeObject(), view.a()));
        view.a = 0L;
    }

    public final void w() {
        nFlushAndWait(getNativeObject(), -1L);
    }
}
