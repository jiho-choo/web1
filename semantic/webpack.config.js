const path = require("path");

module.exports = {
  context: __dirname,
  entry: "./src/app.js",
  output: {
    path: path.resolve(__dirname, "js"),
    publicPath: "/js/",
    filename: "app.js",
  },

  module: {
    rules: [
      {
        test: /\.css$/,
        exclude: /node_modules/,
        loader: ["style-loader", "css-loader"],
      },
      {
        test: /\.js$/,
        enforce: "pre",
        use: ["source-map-loader"],
      },
    ],
  },
  devServer: {
    contentBase: path.resolve(__dirname, "html"),
    compress: true,
    port: 9000,
    progress: true,
    clientLogLevel: "info",
  },

  //   devServer: {
  //     contentBase: path.join(__dirname, "public/"),
  //     compress: true,
  //     port: 4500,
  //     hot: true,
  //     publicPath: "http://localhost:4500/dist/",
  //     progress: true,
  //     clientLogLevel: "info",
  //   },
};
