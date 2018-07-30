// import all json file and export those as value
declare module "*.json" {
    const value: any;
    export default value;
}