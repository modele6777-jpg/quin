package defpackage;

import com.google.android.filament.Camera;
import com.google.android.filament.ColorGrading;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.RenderTarget;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.View;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hhe {
    public final Engine a;
    public final Renderer b;
    public final Scene c;
    public final View d;
    public final ColorGrading e;
    public final int f;
    public final Material g;
    public final lqb h;
    public final RenderTarget i;
    public final Texture j;
    public final Texture k;
    public final SwapChain l;
    public final Texture m;
    public final Texture n;
    public final Texture o;
    public final ArrayList p;
    public final l7c q;
    public final TextureSampler r;
    public final ByteBuffer s;

    public hhe(Engine engine, Renderer renderer, Scene scene, View view, ColorGrading colorGrading, Camera camera, int i, Material material, lqb lqbVar, RenderTarget renderTarget, Texture texture, Texture texture2, SwapChain swapChain, Texture texture3, Texture texture4, Texture texture5, ArrayList arrayList, l7c l7cVar, TextureSampler textureSampler, ByteBuffer byteBuffer) {
        this.a = engine;
        this.b = renderer;
        this.c = scene;
        this.d = view;
        this.e = colorGrading;
        this.f = i;
        this.g = material;
        this.h = lqbVar;
        this.i = renderTarget;
        this.j = texture;
        this.k = texture2;
        this.l = swapChain;
        this.m = texture3;
        this.n = texture4;
        this.o = texture5;
        this.p = arrayList;
        this.q = l7cVar;
        this.r = textureSampler;
        this.s = byteBuffer;
    }
}
