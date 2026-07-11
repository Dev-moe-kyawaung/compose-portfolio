# Moe Kyaw Aung — Senior Android Developer Portfolio

Built with Kotlin/Wasm + Compose Multiplatform, deployed on GitHub Pages.

## Development

\`\`\`bash
./gradlew wasmJsBrowserDevelopmentRun --continuous
\`\`\`

Visit `http://localhost:8080`

## Production Build

\`\`\`bash
./gradlew wasmJsBrowserDistribution
\`\`\`

Output: `build/dist/wasmJs/productionExecutable/`

## Deployment

Automatic via GitHub Actions on push to `main`. See `.github/workflows/deploy.yml`.

## Browser Compatibility

Kotlin/Wasm requires a browser with WasmGC support:
- Chrome/Edge 119+
- Firefox 120+
- Safari 18+ (partial support — test thoroughly)

For broader compatibility, consider a static fallback or feature-detection redirect.

